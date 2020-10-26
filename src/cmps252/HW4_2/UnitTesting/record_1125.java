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

@Tag("48")
class Record_1125 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1125: FirstName is Migdalia")
	void FirstNameOfRecord1125() {
		assertEquals("Migdalia", customers.get(1124).getFirstName());
	}

	@Test
	@DisplayName("Record 1125: LastName is Laperle")
	void LastNameOfRecord1125() {
		assertEquals("Laperle", customers.get(1124).getLastName());
	}

	@Test
	@DisplayName("Record 1125: Company is Pip Printing")
	void CompanyOfRecord1125() {
		assertEquals("Pip Printing", customers.get(1124).getCompany());
	}

	@Test
	@DisplayName("Record 1125: Address is 1911 Chesney Rd E")
	void AddressOfRecord1125() {
		assertEquals("1911 Chesney Rd E", customers.get(1124).getAddress());
	}

	@Test
	@DisplayName("Record 1125: City is Tacoma")
	void CityOfRecord1125() {
		assertEquals("Tacoma", customers.get(1124).getCity());
	}

	@Test
	@DisplayName("Record 1125: County is Pierce")
	void CountyOfRecord1125() {
		assertEquals("Pierce", customers.get(1124).getCounty());
	}

	@Test
	@DisplayName("Record 1125: State is WA")
	void StateOfRecord1125() {
		assertEquals("WA", customers.get(1124).getState());
	}

	@Test
	@DisplayName("Record 1125: ZIP is 98445")
	void ZIPOfRecord1125() {
		assertEquals("98445", customers.get(1124).getZIP());
	}

	@Test
	@DisplayName("Record 1125: Phone is 253-535-5549")
	void PhoneOfRecord1125() {
		assertEquals("253-535-5549", customers.get(1124).getPhone());
	}

	@Test
	@DisplayName("Record 1125: Fax is 253-535-9429")
	void FaxOfRecord1125() {
		assertEquals("253-535-9429", customers.get(1124).getFax());
	}

	@Test
	@DisplayName("Record 1125: Email is migdalia@laperle.com")
	void EmailOfRecord1125() {
		assertEquals("migdalia@laperle.com", customers.get(1124).getEmail());
	}

	@Test
	@DisplayName("Record 1125: Web is http://www.migdalialaperle.com")
	void WebOfRecord1125() {
		assertEquals("http://www.migdalialaperle.com", customers.get(1124).getWeb());
	}
}
