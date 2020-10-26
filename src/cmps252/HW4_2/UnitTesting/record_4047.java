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
class Record_4047 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4047: FirstName is Weldon")
	void FirstNameOfRecord4047() {
		assertEquals("Weldon", customers.get(4046).getFirstName());
	}

	@Test
	@DisplayName("Record 4047: LastName is Boseman")
	void LastNameOfRecord4047() {
		assertEquals("Boseman", customers.get(4046).getLastName());
	}

	@Test
	@DisplayName("Record 4047: Company is Genstar Stone Products Company")
	void CompanyOfRecord4047() {
		assertEquals("Genstar Stone Products Company", customers.get(4046).getCompany());
	}

	@Test
	@DisplayName("Record 4047: Address is 533 Washington St")
	void AddressOfRecord4047() {
		assertEquals("533 Washington St", customers.get(4046).getAddress());
	}

	@Test
	@DisplayName("Record 4047: City is Abington")
	void CityOfRecord4047() {
		assertEquals("Abington", customers.get(4046).getCity());
	}

	@Test
	@DisplayName("Record 4047: County is Plymouth")
	void CountyOfRecord4047() {
		assertEquals("Plymouth", customers.get(4046).getCounty());
	}

	@Test
	@DisplayName("Record 4047: State is MA")
	void StateOfRecord4047() {
		assertEquals("MA", customers.get(4046).getState());
	}

	@Test
	@DisplayName("Record 4047: ZIP is 2351")
	void ZIPOfRecord4047() {
		assertEquals("2351", customers.get(4046).getZIP());
	}

	@Test
	@DisplayName("Record 4047: Phone is 781-878-9302")
	void PhoneOfRecord4047() {
		assertEquals("781-878-9302", customers.get(4046).getPhone());
	}

	@Test
	@DisplayName("Record 4047: Fax is 781-878-7956")
	void FaxOfRecord4047() {
		assertEquals("781-878-7956", customers.get(4046).getFax());
	}

	@Test
	@DisplayName("Record 4047: Email is weldon@boseman.com")
	void EmailOfRecord4047() {
		assertEquals("weldon@boseman.com", customers.get(4046).getEmail());
	}

	@Test
	@DisplayName("Record 4047: Web is http://www.weldonboseman.com")
	void WebOfRecord4047() {
		assertEquals("http://www.weldonboseman.com", customers.get(4046).getWeb());
	}
}
