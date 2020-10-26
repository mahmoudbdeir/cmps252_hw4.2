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

@Tag("10")
class Record_1584 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1584: FirstName is Demetrius")
	void FirstNameOfRecord1584() {
		assertEquals("Demetrius", customers.get(1583).getFirstName());
	}

	@Test
	@DisplayName("Record 1584: LastName is Rothwell")
	void LastNameOfRecord1584() {
		assertEquals("Rothwell", customers.get(1583).getLastName());
	}

	@Test
	@DisplayName("Record 1584: Company is Proto Tube Products")
	void CompanyOfRecord1584() {
		assertEquals("Proto Tube Products", customers.get(1583).getCompany());
	}

	@Test
	@DisplayName("Record 1584: Address is 1875 Radio Rd")
	void AddressOfRecord1584() {
		assertEquals("1875 Radio Rd", customers.get(1583).getAddress());
	}

	@Test
	@DisplayName("Record 1584: City is Dayton")
	void CityOfRecord1584() {
		assertEquals("Dayton", customers.get(1583).getCity());
	}

	@Test
	@DisplayName("Record 1584: County is Greene")
	void CountyOfRecord1584() {
		assertEquals("Greene", customers.get(1583).getCounty());
	}

	@Test
	@DisplayName("Record 1584: State is OH")
	void StateOfRecord1584() {
		assertEquals("OH", customers.get(1583).getState());
	}

	@Test
	@DisplayName("Record 1584: ZIP is 45431")
	void ZIPOfRecord1584() {
		assertEquals("45431", customers.get(1583).getZIP());
	}

	@Test
	@DisplayName("Record 1584: Phone is 937-252-9319")
	void PhoneOfRecord1584() {
		assertEquals("937-252-9319", customers.get(1583).getPhone());
	}

	@Test
	@DisplayName("Record 1584: Fax is 937-252-9748")
	void FaxOfRecord1584() {
		assertEquals("937-252-9748", customers.get(1583).getFax());
	}

	@Test
	@DisplayName("Record 1584: Email is demetrius@rothwell.com")
	void EmailOfRecord1584() {
		assertEquals("demetrius@rothwell.com", customers.get(1583).getEmail());
	}

	@Test
	@DisplayName("Record 1584: Web is http://www.demetriusrothwell.com")
	void WebOfRecord1584() {
		assertEquals("http://www.demetriusrothwell.com", customers.get(1583).getWeb());
	}
}
