package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("8")
class Record_1129 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1129: FirstName is Lorene")
	void FirstNameOfRecord1129() {
		assertEquals("Lorene", customers.get(1128).getFirstName());
	}

	@Test
	@DisplayName("Record 1129: LastName is Hudrick")
	void LastNameOfRecord1129() {
		assertEquals("Hudrick", customers.get(1128).getLastName());
	}

	@Test
	@DisplayName("Record 1129: Company is Mahoney, John L Esq")
	void CompanyOfRecord1129() {
		assertEquals("Mahoney, John L Esq", customers.get(1128).getCompany());
	}

	@Test
	@DisplayName("Record 1129: Address is 85 Austin Blvd")
	void AddressOfRecord1129() {
		assertEquals("85 Austin Blvd", customers.get(1128).getAddress());
	}

	@Test
	@DisplayName("Record 1129: City is Commack")
	void CityOfRecord1129() {
		assertEquals("Commack", customers.get(1128).getCity());
	}

	@Test
	@DisplayName("Record 1129: County is Suffolk")
	void CountyOfRecord1129() {
		assertEquals("Suffolk", customers.get(1128).getCounty());
	}

	@Test
	@DisplayName("Record 1129: State is NY")
	void StateOfRecord1129() {
		assertEquals("NY", customers.get(1128).getState());
	}

	@Test
	@DisplayName("Record 1129: ZIP is 11725")
	void ZIPOfRecord1129() {
		assertEquals("11725", customers.get(1128).getZIP());
	}

	@Test
	@DisplayName("Record 1129: Phone is 631-543-0793")
	void PhoneOfRecord1129() {
		assertEquals("631-543-0793", customers.get(1128).getPhone());
	}

	@Test
	@DisplayName("Record 1129: Fax is 631-543-4135")
	void FaxOfRecord1129() {
		assertEquals("631-543-4135", customers.get(1128).getFax());
	}

	@Test
	@DisplayName("Record 1129: Email is lorene@hudrick.com")
	void EmailOfRecord1129() {
		assertEquals("lorene@hudrick.com", customers.get(1128).getEmail());
	}

	@Test
	@DisplayName("Record 1129: Web is http://www.lorenehudrick.com")
	void WebOfRecord1129() {
		assertEquals("http://www.lorenehudrick.com", customers.get(1128).getWeb());
	}
}
