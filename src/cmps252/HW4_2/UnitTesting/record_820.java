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

@Tag("6")
class Record_820 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 820: FirstName is Malissa")
	void FirstNameOfRecord820() {
		assertEquals("Malissa", customers.get(819).getFirstName());
	}

	@Test
	@DisplayName("Record 820: LastName is ysert")
	void LastNameOfRecord820() {
		assertEquals("ysert", customers.get(819).getLastName());
	}

	@Test
	@DisplayName("Record 820: Company is A Chinese Restaurant Ming Grdn")
	void CompanyOfRecord820() {
		assertEquals("A Chinese Restaurant Ming Grdn", customers.get(819).getCompany());
	}

	@Test
	@DisplayName("Record 820: Address is 3013 Delta Fair Blvd")
	void AddressOfRecord820() {
		assertEquals("3013 Delta Fair Blvd", customers.get(819).getAddress());
	}

	@Test
	@DisplayName("Record 820: City is Antioch")
	void CityOfRecord820() {
		assertEquals("Antioch", customers.get(819).getCity());
	}

	@Test
	@DisplayName("Record 820: County is Contra Costa")
	void CountyOfRecord820() {
		assertEquals("Contra Costa", customers.get(819).getCounty());
	}

	@Test
	@DisplayName("Record 820: State is CA")
	void StateOfRecord820() {
		assertEquals("CA", customers.get(819).getState());
	}

	@Test
	@DisplayName("Record 820: ZIP is 94509")
	void ZIPOfRecord820() {
		assertEquals("94509", customers.get(819).getZIP());
	}

	@Test
	@DisplayName("Record 820: Phone is 925-754-0663")
	void PhoneOfRecord820() {
		assertEquals("925-754-0663", customers.get(819).getPhone());
	}

	@Test
	@DisplayName("Record 820: Fax is 925-754-6569")
	void FaxOfRecord820() {
		assertEquals("925-754-6569", customers.get(819).getFax());
	}

	@Test
	@DisplayName("Record 820: Email is malissa@ysert.com")
	void EmailOfRecord820() {
		assertEquals("malissa@ysert.com", customers.get(819).getEmail());
	}

	@Test
	@DisplayName("Record 820: Web is http://www.malissaysert.com")
	void WebOfRecord820() {
		assertEquals("http://www.malissaysert.com", customers.get(819).getWeb());
	}
}
