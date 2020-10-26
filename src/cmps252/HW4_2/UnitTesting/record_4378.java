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

@Tag("14")
class Record_4378 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4378: FirstName is Caleb")
	void FirstNameOfRecord4378() {
		assertEquals("Caleb", customers.get(4377).getFirstName());
	}

	@Test
	@DisplayName("Record 4378: LastName is Stuckmeyer")
	void LastNameOfRecord4378() {
		assertEquals("Stuckmeyer", customers.get(4377).getLastName());
	}

	@Test
	@DisplayName("Record 4378: Company is Modern Contact Furniture Inc")
	void CompanyOfRecord4378() {
		assertEquals("Modern Contact Furniture Inc", customers.get(4377).getCompany());
	}

	@Test
	@DisplayName("Record 4378: Address is 1990 M St Nw")
	void AddressOfRecord4378() {
		assertEquals("1990 M St Nw", customers.get(4377).getAddress());
	}

	@Test
	@DisplayName("Record 4378: City is Washington")
	void CityOfRecord4378() {
		assertEquals("Washington", customers.get(4377).getCity());
	}

	@Test
	@DisplayName("Record 4378: County is District of Columbia")
	void CountyOfRecord4378() {
		assertEquals("District of Columbia", customers.get(4377).getCounty());
	}

	@Test
	@DisplayName("Record 4378: State is DC")
	void StateOfRecord4378() {
		assertEquals("DC", customers.get(4377).getState());
	}

	@Test
	@DisplayName("Record 4378: ZIP is 20036")
	void ZIPOfRecord4378() {
		assertEquals("20036", customers.get(4377).getZIP());
	}

	@Test
	@DisplayName("Record 4378: Phone is 202-293-0595")
	void PhoneOfRecord4378() {
		assertEquals("202-293-0595", customers.get(4377).getPhone());
	}

	@Test
	@DisplayName("Record 4378: Fax is 202-293-1882")
	void FaxOfRecord4378() {
		assertEquals("202-293-1882", customers.get(4377).getFax());
	}

	@Test
	@DisplayName("Record 4378: Email is caleb@stuckmeyer.com")
	void EmailOfRecord4378() {
		assertEquals("caleb@stuckmeyer.com", customers.get(4377).getEmail());
	}

	@Test
	@DisplayName("Record 4378: Web is http://www.calebstuckmeyer.com")
	void WebOfRecord4378() {
		assertEquals("http://www.calebstuckmeyer.com", customers.get(4377).getWeb());
	}
}
