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

@Tag("11")
class Record_2571 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2571: FirstName is Mallory")
	void FirstNameOfRecord2571() {
		assertEquals("Mallory", customers.get(2570).getFirstName());
	}

	@Test
	@DisplayName("Record 2571: LastName is Landess")
	void LastNameOfRecord2571() {
		assertEquals("Landess", customers.get(2570).getLastName());
	}

	@Test
	@DisplayName("Record 2571: Company is Johnson Hardware Inc")
	void CompanyOfRecord2571() {
		assertEquals("Johnson Hardware Inc", customers.get(2570).getCompany());
	}

	@Test
	@DisplayName("Record 2571: Address is 9585 Cilley Rd")
	void AddressOfRecord2571() {
		assertEquals("9585 Cilley Rd", customers.get(2570).getAddress());
	}

	@Test
	@DisplayName("Record 2571: City is Cleves")
	void CityOfRecord2571() {
		assertEquals("Cleves", customers.get(2570).getCity());
	}

	@Test
	@DisplayName("Record 2571: County is Hamilton")
	void CountyOfRecord2571() {
		assertEquals("Hamilton", customers.get(2570).getCounty());
	}

	@Test
	@DisplayName("Record 2571: State is OH")
	void StateOfRecord2571() {
		assertEquals("OH", customers.get(2570).getState());
	}

	@Test
	@DisplayName("Record 2571: ZIP is 45002")
	void ZIPOfRecord2571() {
		assertEquals("45002", customers.get(2570).getZIP());
	}

	@Test
	@DisplayName("Record 2571: Phone is 513-353-4161")
	void PhoneOfRecord2571() {
		assertEquals("513-353-4161", customers.get(2570).getPhone());
	}

	@Test
	@DisplayName("Record 2571: Fax is 513-353-1346")
	void FaxOfRecord2571() {
		assertEquals("513-353-1346", customers.get(2570).getFax());
	}

	@Test
	@DisplayName("Record 2571: Email is mallory@landess.com")
	void EmailOfRecord2571() {
		assertEquals("mallory@landess.com", customers.get(2570).getEmail());
	}

	@Test
	@DisplayName("Record 2571: Web is http://www.mallorylandess.com")
	void WebOfRecord2571() {
		assertEquals("http://www.mallorylandess.com", customers.get(2570).getWeb());
	}
}
