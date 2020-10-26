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

@Tag("21")
class Record_731 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 731: FirstName is Hiram")
	void FirstNameOfRecord731() {
		assertEquals("Hiram", customers.get(730).getFirstName());
	}

	@Test
	@DisplayName("Record 731: LastName is Hallack")
	void LastNameOfRecord731() {
		assertEquals("Hallack", customers.get(730).getLastName());
	}

	@Test
	@DisplayName("Record 731: Company is Iowa County Advertiser")
	void CompanyOfRecord731() {
		assertEquals("Iowa County Advertiser", customers.get(730).getCompany());
	}

	@Test
	@DisplayName("Record 731: Address is 710 E 236th St")
	void AddressOfRecord731() {
		assertEquals("710 E 236th St", customers.get(730).getAddress());
	}

	@Test
	@DisplayName("Record 731: City is Bronx")
	void CityOfRecord731() {
		assertEquals("Bronx", customers.get(730).getCity());
	}

	@Test
	@DisplayName("Record 731: County is Bronx")
	void CountyOfRecord731() {
		assertEquals("Bronx", customers.get(730).getCounty());
	}

	@Test
	@DisplayName("Record 731: State is NY")
	void StateOfRecord731() {
		assertEquals("NY", customers.get(730).getState());
	}

	@Test
	@DisplayName("Record 731: ZIP is 10466")
	void ZIPOfRecord731() {
		assertEquals("10466", customers.get(730).getZIP());
	}

	@Test
	@DisplayName("Record 731: Phone is 718-324-0418")
	void PhoneOfRecord731() {
		assertEquals("718-324-0418", customers.get(730).getPhone());
	}

	@Test
	@DisplayName("Record 731: Fax is 718-324-1338")
	void FaxOfRecord731() {
		assertEquals("718-324-1338", customers.get(730).getFax());
	}

	@Test
	@DisplayName("Record 731: Email is hiram@hallack.com")
	void EmailOfRecord731() {
		assertEquals("hiram@hallack.com", customers.get(730).getEmail());
	}

	@Test
	@DisplayName("Record 731: Web is http://www.hiramhallack.com")
	void WebOfRecord731() {
		assertEquals("http://www.hiramhallack.com", customers.get(730).getWeb());
	}
}
