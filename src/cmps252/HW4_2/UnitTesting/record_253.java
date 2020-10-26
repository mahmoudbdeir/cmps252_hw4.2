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

@Tag("37")
class Record_253 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 253: FirstName is Peggy")
	void FirstNameOfRecord253() {
		assertEquals("Peggy", customers.get(252).getFirstName());
	}

	@Test
	@DisplayName("Record 253: LastName is Blackwelder")
	void LastNameOfRecord253() {
		assertEquals("Blackwelder", customers.get(252).getLastName());
	}

	@Test
	@DisplayName("Record 253: Company is Rochester Fair Assn")
	void CompanyOfRecord253() {
		assertEquals("Rochester Fair Assn", customers.get(252).getCompany());
	}

	@Test
	@DisplayName("Record 253: Address is 249 E Chestnut Hill Rd")
	void AddressOfRecord253() {
		assertEquals("249 E Chestnut Hill Rd", customers.get(252).getAddress());
	}

	@Test
	@DisplayName("Record 253: City is Newark")
	void CityOfRecord253() {
		assertEquals("Newark", customers.get(252).getCity());
	}

	@Test
	@DisplayName("Record 253: County is New Castle")
	void CountyOfRecord253() {
		assertEquals("New Castle", customers.get(252).getCounty());
	}

	@Test
	@DisplayName("Record 253: State is DE")
	void StateOfRecord253() {
		assertEquals("DE", customers.get(252).getState());
	}

	@Test
	@DisplayName("Record 253: ZIP is 19713")
	void ZIPOfRecord253() {
		assertEquals("19713", customers.get(252).getZIP());
	}

	@Test
	@DisplayName("Record 253: Phone is 302-368-0968")
	void PhoneOfRecord253() {
		assertEquals("302-368-0968", customers.get(252).getPhone());
	}

	@Test
	@DisplayName("Record 253: Fax is 302-368-4003")
	void FaxOfRecord253() {
		assertEquals("302-368-4003", customers.get(252).getFax());
	}

	@Test
	@DisplayName("Record 253: Email is peggy@blackwelder.com")
	void EmailOfRecord253() {
		assertEquals("peggy@blackwelder.com", customers.get(252).getEmail());
	}

	@Test
	@DisplayName("Record 253: Web is http://www.peggyblackwelder.com")
	void WebOfRecord253() {
		assertEquals("http://www.peggyblackwelder.com", customers.get(252).getWeb());
	}
}
