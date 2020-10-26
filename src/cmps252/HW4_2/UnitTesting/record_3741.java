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

@Tag("7")
class Record_3741 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3741: FirstName is Ramon")
	void FirstNameOfRecord3741() {
		assertEquals("Ramon", customers.get(3740).getFirstName());
	}

	@Test
	@DisplayName("Record 3741: LastName is Lulic")
	void LastNameOfRecord3741() {
		assertEquals("Lulic", customers.get(3740).getLastName());
	}

	@Test
	@DisplayName("Record 3741: Company is Recker, Robert R Md")
	void CompanyOfRecord3741() {
		assertEquals("Recker, Robert R Md", customers.get(3740).getCompany());
	}

	@Test
	@DisplayName("Record 3741: Address is 721 N Highway 5")
	void AddressOfRecord3741() {
		assertEquals("721 N Highway 5", customers.get(3740).getAddress());
	}

	@Test
	@DisplayName("Record 3741: City is Mountain Home")
	void CityOfRecord3741() {
		assertEquals("Mountain Home", customers.get(3740).getCity());
	}

	@Test
	@DisplayName("Record 3741: County is Baxter")
	void CountyOfRecord3741() {
		assertEquals("Baxter", customers.get(3740).getCounty());
	}

	@Test
	@DisplayName("Record 3741: State is AR")
	void StateOfRecord3741() {
		assertEquals("AR", customers.get(3740).getState());
	}

	@Test
	@DisplayName("Record 3741: ZIP is 72653")
	void ZIPOfRecord3741() {
		assertEquals("72653", customers.get(3740).getZIP());
	}

	@Test
	@DisplayName("Record 3741: Phone is 870-425-1923")
	void PhoneOfRecord3741() {
		assertEquals("870-425-1923", customers.get(3740).getPhone());
	}

	@Test
	@DisplayName("Record 3741: Fax is 870-425-9511")
	void FaxOfRecord3741() {
		assertEquals("870-425-9511", customers.get(3740).getFax());
	}

	@Test
	@DisplayName("Record 3741: Email is ramon@lulic.com")
	void EmailOfRecord3741() {
		assertEquals("ramon@lulic.com", customers.get(3740).getEmail());
	}

	@Test
	@DisplayName("Record 3741: Web is http://www.ramonlulic.com")
	void WebOfRecord3741() {
		assertEquals("http://www.ramonlulic.com", customers.get(3740).getWeb());
	}
}
