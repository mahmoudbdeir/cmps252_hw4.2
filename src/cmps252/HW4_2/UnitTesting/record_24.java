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
class Record_24 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 24: FirstName is Elvis")
	void FirstNameOfRecord24() {
		assertEquals("Elvis", customers.get(23).getFirstName());
	}

	@Test
	@DisplayName("Record 24: LastName is Sjoberg")
	void LastNameOfRecord24() {
		assertEquals("Sjoberg", customers.get(23).getLastName());
	}

	@Test
	@DisplayName("Record 24: Company is Nelson, Roy H Esq")
	void CompanyOfRecord24() {
		assertEquals("Nelson, Roy H Esq", customers.get(23).getCompany());
	}

	@Test
	@DisplayName("Record 24: Address is 58 S Main St")
	void AddressOfRecord24() {
		assertEquals("58 S Main St", customers.get(23).getAddress());
	}

	@Test
	@DisplayName("Record 24: City is Youngstown")
	void CityOfRecord24() {
		assertEquals("Youngstown", customers.get(23).getCity());
	}

	@Test
	@DisplayName("Record 24: County is Mahoning")
	void CountyOfRecord24() {
		assertEquals("Mahoning", customers.get(23).getCounty());
	}

	@Test
	@DisplayName("Record 24: State is OH")
	void StateOfRecord24() {
		assertEquals("OH", customers.get(23).getState());
	}

	@Test
	@DisplayName("Record 24: ZIP is 44514")
	void ZIPOfRecord24() {
		assertEquals("44514", customers.get(23).getZIP());
	}

	@Test
	@DisplayName("Record 24: Phone is 330-757-0430")
	void PhoneOfRecord24() {
		assertEquals("330-757-0430", customers.get(23).getPhone());
	}

	@Test
	@DisplayName("Record 24: Fax is 330-757-6653")
	void FaxOfRecord24() {
		assertEquals("330-757-6653", customers.get(23).getFax());
	}

	@Test
	@DisplayName("Record 24: Email is elvis@sjoberg.com")
	void EmailOfRecord24() {
		assertEquals("elvis@sjoberg.com", customers.get(23).getEmail());
	}

	@Test
	@DisplayName("Record 24: Web is http://www.elvissjoberg.com")
	void WebOfRecord24() {
		assertEquals("http://www.elvissjoberg.com", customers.get(23).getWeb());
	}
}
