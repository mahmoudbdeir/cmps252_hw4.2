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

@Tag("28")
class Record_2865 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2865: FirstName is Ellie")
	void FirstNameOfRecord2865() {
		assertEquals("Ellie", customers.get(2864).getFirstName());
	}

	@Test
	@DisplayName("Record 2865: LastName is Brunk")
	void LastNameOfRecord2865() {
		assertEquals("Brunk", customers.get(2864).getLastName());
	}

	@Test
	@DisplayName("Record 2865: Company is Davis Grande Inc")
	void CompanyOfRecord2865() {
		assertEquals("Davis Grande Inc", customers.get(2864).getCompany());
	}

	@Test
	@DisplayName("Record 2865: Address is 22628 Foothill Blvd")
	void AddressOfRecord2865() {
		assertEquals("22628 Foothill Blvd", customers.get(2864).getAddress());
	}

	@Test
	@DisplayName("Record 2865: City is Hayward")
	void CityOfRecord2865() {
		assertEquals("Hayward", customers.get(2864).getCity());
	}

	@Test
	@DisplayName("Record 2865: County is Alameda")
	void CountyOfRecord2865() {
		assertEquals("Alameda", customers.get(2864).getCounty());
	}

	@Test
	@DisplayName("Record 2865: State is CA")
	void StateOfRecord2865() {
		assertEquals("CA", customers.get(2864).getState());
	}

	@Test
	@DisplayName("Record 2865: ZIP is 94541")
	void ZIPOfRecord2865() {
		assertEquals("94541", customers.get(2864).getZIP());
	}

	@Test
	@DisplayName("Record 2865: Phone is 510-581-5604")
	void PhoneOfRecord2865() {
		assertEquals("510-581-5604", customers.get(2864).getPhone());
	}

	@Test
	@DisplayName("Record 2865: Fax is 510-581-8938")
	void FaxOfRecord2865() {
		assertEquals("510-581-8938", customers.get(2864).getFax());
	}

	@Test
	@DisplayName("Record 2865: Email is ellie@brunk.com")
	void EmailOfRecord2865() {
		assertEquals("ellie@brunk.com", customers.get(2864).getEmail());
	}

	@Test
	@DisplayName("Record 2865: Web is http://www.elliebrunk.com")
	void WebOfRecord2865() {
		assertEquals("http://www.elliebrunk.com", customers.get(2864).getWeb());
	}
}
