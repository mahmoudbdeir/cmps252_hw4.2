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

@Tag("29")
class Record_1674 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1674: FirstName is Bernice")
	void FirstNameOfRecord1674() {
		assertEquals("Bernice", customers.get(1673).getFirstName());
	}

	@Test
	@DisplayName("Record 1674: LastName is Kurschner")
	void LastNameOfRecord1674() {
		assertEquals("Kurschner", customers.get(1673).getLastName());
	}

	@Test
	@DisplayName("Record 1674: Company is Regional Electrical Systems")
	void CompanyOfRecord1674() {
		assertEquals("Regional Electrical Systems", customers.get(1673).getCompany());
	}

	@Test
	@DisplayName("Record 1674: Address is 1110 N Loop  #-336w")
	void AddressOfRecord1674() {
		assertEquals("1110 N Loop  #-336w", customers.get(1673).getAddress());
	}

	@Test
	@DisplayName("Record 1674: City is Conroe")
	void CityOfRecord1674() {
		assertEquals("Conroe", customers.get(1673).getCity());
	}

	@Test
	@DisplayName("Record 1674: County is Montgomery")
	void CountyOfRecord1674() {
		assertEquals("Montgomery", customers.get(1673).getCounty());
	}

	@Test
	@DisplayName("Record 1674: State is TX")
	void StateOfRecord1674() {
		assertEquals("TX", customers.get(1673).getState());
	}

	@Test
	@DisplayName("Record 1674: ZIP is 77301")
	void ZIPOfRecord1674() {
		assertEquals("77301", customers.get(1673).getZIP());
	}

	@Test
	@DisplayName("Record 1674: Phone is 936-756-3034")
	void PhoneOfRecord1674() {
		assertEquals("936-756-3034", customers.get(1673).getPhone());
	}

	@Test
	@DisplayName("Record 1674: Fax is 936-756-5027")
	void FaxOfRecord1674() {
		assertEquals("936-756-5027", customers.get(1673).getFax());
	}

	@Test
	@DisplayName("Record 1674: Email is bernice@kurschner.com")
	void EmailOfRecord1674() {
		assertEquals("bernice@kurschner.com", customers.get(1673).getEmail());
	}

	@Test
	@DisplayName("Record 1674: Web is http://www.bernicekurschner.com")
	void WebOfRecord1674() {
		assertEquals("http://www.bernicekurschner.com", customers.get(1673).getWeb());
	}
}
