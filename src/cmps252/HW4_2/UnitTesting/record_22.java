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

@Tag("38")
class Record_22 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 22: FirstName is Jules")
	void FirstNameOfRecord22() {
		assertEquals("Jules", customers.get(21).getFirstName());
	}

	@Test
	@DisplayName("Record 22: LastName is Kellerhouse")
	void LastNameOfRecord22() {
		assertEquals("Kellerhouse", customers.get(21).getLastName());
	}

	@Test
	@DisplayName("Record 22: Company is Apt Guid Orng Cnty Long Bch")
	void CompanyOfRecord22() {
		assertEquals("Apt Guid Orng Cnty Long Bch", customers.get(21).getCompany());
	}

	@Test
	@DisplayName("Record 22: Address is 5300 Springboro Pike")
	void AddressOfRecord22() {
		assertEquals("5300 Springboro Pike", customers.get(21).getAddress());
	}

	@Test
	@DisplayName("Record 22: City is Dayton")
	void CityOfRecord22() {
		assertEquals("Dayton", customers.get(21).getCity());
	}

	@Test
	@DisplayName("Record 22: County is Montgomery")
	void CountyOfRecord22() {
		assertEquals("Montgomery", customers.get(21).getCounty());
	}

	@Test
	@DisplayName("Record 22: State is OH")
	void StateOfRecord22() {
		assertEquals("OH", customers.get(21).getState());
	}

	@Test
	@DisplayName("Record 22: ZIP is 45439")
	void ZIPOfRecord22() {
		assertEquals("45439", customers.get(21).getZIP());
	}

	@Test
	@DisplayName("Record 22: Phone is 937-294-6534")
	void PhoneOfRecord22() {
		assertEquals("937-294-6534", customers.get(21).getPhone());
	}

	@Test
	@DisplayName("Record 22: Fax is 937-294-7104")
	void FaxOfRecord22() {
		assertEquals("937-294-7104", customers.get(21).getFax());
	}

	@Test
	@DisplayName("Record 22: Email is jules@kellerhouse.com")
	void EmailOfRecord22() {
		assertEquals("jules@kellerhouse.com", customers.get(21).getEmail());
	}

	@Test
	@DisplayName("Record 22: Web is http://www.juleskellerhouse.com")
	void WebOfRecord22() {
		assertEquals("http://www.juleskellerhouse.com", customers.get(21).getWeb());
	}
}
