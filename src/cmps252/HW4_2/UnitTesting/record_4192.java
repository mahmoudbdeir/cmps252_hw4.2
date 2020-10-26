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

@Tag("49")
class Record_4192 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4192: FirstName is Cherie")
	void FirstNameOfRecord4192() {
		assertEquals("Cherie", customers.get(4191).getFirstName());
	}

	@Test
	@DisplayName("Record 4192: LastName is Dimarzo")
	void LastNameOfRecord4192() {
		assertEquals("Dimarzo", customers.get(4191).getLastName());
	}

	@Test
	@DisplayName("Record 4192: Company is Board Of City Devt Bcd Cnvnt")
	void CompanyOfRecord4192() {
		assertEquals("Board Of City Devt Bcd Cnvnt", customers.get(4191).getCompany());
	}

	@Test
	@DisplayName("Record 4192: Address is 233 S 4th St")
	void AddressOfRecord4192() {
		assertEquals("233 S 4th St", customers.get(4191).getAddress());
	}

	@Test
	@DisplayName("Record 4192: City is Las Vegas")
	void CityOfRecord4192() {
		assertEquals("Las Vegas", customers.get(4191).getCity());
	}

	@Test
	@DisplayName("Record 4192: County is Clark")
	void CountyOfRecord4192() {
		assertEquals("Clark", customers.get(4191).getCounty());
	}

	@Test
	@DisplayName("Record 4192: State is NV")
	void StateOfRecord4192() {
		assertEquals("NV", customers.get(4191).getState());
	}

	@Test
	@DisplayName("Record 4192: ZIP is 89101")
	void ZIPOfRecord4192() {
		assertEquals("89101", customers.get(4191).getZIP());
	}

	@Test
	@DisplayName("Record 4192: Phone is 702-384-4220")
	void PhoneOfRecord4192() {
		assertEquals("702-384-4220", customers.get(4191).getPhone());
	}

	@Test
	@DisplayName("Record 4192: Fax is 702-384-8534")
	void FaxOfRecord4192() {
		assertEquals("702-384-8534", customers.get(4191).getFax());
	}

	@Test
	@DisplayName("Record 4192: Email is cherie@dimarzo.com")
	void EmailOfRecord4192() {
		assertEquals("cherie@dimarzo.com", customers.get(4191).getEmail());
	}

	@Test
	@DisplayName("Record 4192: Web is http://www.cheriedimarzo.com")
	void WebOfRecord4192() {
		assertEquals("http://www.cheriedimarzo.com", customers.get(4191).getWeb());
	}
}
