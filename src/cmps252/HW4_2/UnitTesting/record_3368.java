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

@Tag("39")
class Record_3368 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3368: FirstName is Dora")
	void FirstNameOfRecord3368() {
		assertEquals("Dora", customers.get(3367).getFirstName());
	}

	@Test
	@DisplayName("Record 3368: LastName is Humes")
	void LastNameOfRecord3368() {
		assertEquals("Humes", customers.get(3367).getLastName());
	}

	@Test
	@DisplayName("Record 3368: Company is All Ways Metal Inc")
	void CompanyOfRecord3368() {
		assertEquals("All Ways Metal Inc", customers.get(3367).getCompany());
	}

	@Test
	@DisplayName("Record 3368: Address is 1111 16th St Nw")
	void AddressOfRecord3368() {
		assertEquals("1111 16th St Nw", customers.get(3367).getAddress());
	}

	@Test
	@DisplayName("Record 3368: City is Washington")
	void CityOfRecord3368() {
		assertEquals("Washington", customers.get(3367).getCity());
	}

	@Test
	@DisplayName("Record 3368: County is District of Columbia")
	void CountyOfRecord3368() {
		assertEquals("District of Columbia", customers.get(3367).getCounty());
	}

	@Test
	@DisplayName("Record 3368: State is DC")
	void StateOfRecord3368() {
		assertEquals("DC", customers.get(3367).getState());
	}

	@Test
	@DisplayName("Record 3368: ZIP is 20036")
	void ZIPOfRecord3368() {
		assertEquals("20036", customers.get(3367).getZIP());
	}

	@Test
	@DisplayName("Record 3368: Phone is 202-872-8257")
	void PhoneOfRecord3368() {
		assertEquals("202-872-8257", customers.get(3367).getPhone());
	}

	@Test
	@DisplayName("Record 3368: Fax is 202-872-7105")
	void FaxOfRecord3368() {
		assertEquals("202-872-7105", customers.get(3367).getFax());
	}

	@Test
	@DisplayName("Record 3368: Email is dora@humes.com")
	void EmailOfRecord3368() {
		assertEquals("dora@humes.com", customers.get(3367).getEmail());
	}

	@Test
	@DisplayName("Record 3368: Web is http://www.dorahumes.com")
	void WebOfRecord3368() {
		assertEquals("http://www.dorahumes.com", customers.get(3367).getWeb());
	}
}
