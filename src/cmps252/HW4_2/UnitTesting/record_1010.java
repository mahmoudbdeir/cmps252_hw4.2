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

@Tag("3")
class Record_1010 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1010: FirstName is Lamar")
	void FirstNameOfRecord1010() {
		assertEquals("Lamar", customers.get(1009).getFirstName());
	}

	@Test
	@DisplayName("Record 1010: LastName is Dayrit")
	void LastNameOfRecord1010() {
		assertEquals("Dayrit", customers.get(1009).getLastName());
	}

	@Test
	@DisplayName("Record 1010: Company is Mitchell, W Harold Esq")
	void CompanyOfRecord1010() {
		assertEquals("Mitchell, W Harold Esq", customers.get(1009).getCompany());
	}

	@Test
	@DisplayName("Record 1010: Address is 35 Larkfield Rd")
	void AddressOfRecord1010() {
		assertEquals("35 Larkfield Rd", customers.get(1009).getAddress());
	}

	@Test
	@DisplayName("Record 1010: City is East Northport")
	void CityOfRecord1010() {
		assertEquals("East Northport", customers.get(1009).getCity());
	}

	@Test
	@DisplayName("Record 1010: County is Suffolk")
	void CountyOfRecord1010() {
		assertEquals("Suffolk", customers.get(1009).getCounty());
	}

	@Test
	@DisplayName("Record 1010: State is NY")
	void StateOfRecord1010() {
		assertEquals("NY", customers.get(1009).getState());
	}

	@Test
	@DisplayName("Record 1010: ZIP is 11731")
	void ZIPOfRecord1010() {
		assertEquals("11731", customers.get(1009).getZIP());
	}

	@Test
	@DisplayName("Record 1010: Phone is 631-757-7040")
	void PhoneOfRecord1010() {
		assertEquals("631-757-7040", customers.get(1009).getPhone());
	}

	@Test
	@DisplayName("Record 1010: Fax is 631-757-8705")
	void FaxOfRecord1010() {
		assertEquals("631-757-8705", customers.get(1009).getFax());
	}

	@Test
	@DisplayName("Record 1010: Email is lamar@dayrit.com")
	void EmailOfRecord1010() {
		assertEquals("lamar@dayrit.com", customers.get(1009).getEmail());
	}

	@Test
	@DisplayName("Record 1010: Web is http://www.lamardayrit.com")
	void WebOfRecord1010() {
		assertEquals("http://www.lamardayrit.com", customers.get(1009).getWeb());
	}
}
