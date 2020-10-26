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

@Tag("48")
class Record_2862 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2862: FirstName is Steve")
	void FirstNameOfRecord2862() {
		assertEquals("Steve", customers.get(2861).getFirstName());
	}

	@Test
	@DisplayName("Record 2862: LastName is Albertson")
	void LastNameOfRecord2862() {
		assertEquals("Albertson", customers.get(2861).getLastName());
	}

	@Test
	@DisplayName("Record 2862: Company is Sun Quest Tanning Salon")
	void CompanyOfRecord2862() {
		assertEquals("Sun Quest Tanning Salon", customers.get(2861).getCompany());
	}

	@Test
	@DisplayName("Record 2862: Address is 6819 Highway Blvd")
	void AddressOfRecord2862() {
		assertEquals("6819 Highway Blvd", customers.get(2861).getAddress());
	}

	@Test
	@DisplayName("Record 2862: City is Katy")
	void CityOfRecord2862() {
		assertEquals("Katy", customers.get(2861).getCity());
	}

	@Test
	@DisplayName("Record 2862: County is Fort Bend")
	void CountyOfRecord2862() {
		assertEquals("Fort Bend", customers.get(2861).getCounty());
	}

	@Test
	@DisplayName("Record 2862: State is TX")
	void StateOfRecord2862() {
		assertEquals("TX", customers.get(2861).getState());
	}

	@Test
	@DisplayName("Record 2862: ZIP is 77494")
	void ZIPOfRecord2862() {
		assertEquals("77494", customers.get(2861).getZIP());
	}

	@Test
	@DisplayName("Record 2862: Phone is 281-391-5054")
	void PhoneOfRecord2862() {
		assertEquals("281-391-5054", customers.get(2861).getPhone());
	}

	@Test
	@DisplayName("Record 2862: Fax is 281-391-8925")
	void FaxOfRecord2862() {
		assertEquals("281-391-8925", customers.get(2861).getFax());
	}

	@Test
	@DisplayName("Record 2862: Email is steve@albertson.com")
	void EmailOfRecord2862() {
		assertEquals("steve@albertson.com", customers.get(2861).getEmail());
	}

	@Test
	@DisplayName("Record 2862: Web is http://www.stevealbertson.com")
	void WebOfRecord2862() {
		assertEquals("http://www.stevealbertson.com", customers.get(2861).getWeb());
	}
}
