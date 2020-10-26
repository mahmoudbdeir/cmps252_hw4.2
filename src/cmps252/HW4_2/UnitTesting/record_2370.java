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

@Tag("15")
class Record_2370 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2370: FirstName is Mac")
	void FirstNameOfRecord2370() {
		assertEquals("Mac", customers.get(2369).getFirstName());
	}

	@Test
	@DisplayName("Record 2370: LastName is Hugill")
	void LastNameOfRecord2370() {
		assertEquals("Hugill", customers.get(2369).getLastName());
	}

	@Test
	@DisplayName("Record 2370: Company is Greenberg, James D Esq")
	void CompanyOfRecord2370() {
		assertEquals("Greenberg, James D Esq", customers.get(2369).getCompany());
	}

	@Test
	@DisplayName("Record 2370: Address is 35 E 7th St  #-209")
	void AddressOfRecord2370() {
		assertEquals("35 E 7th St  #-209", customers.get(2369).getAddress());
	}

	@Test
	@DisplayName("Record 2370: City is Cincinnati")
	void CityOfRecord2370() {
		assertEquals("Cincinnati", customers.get(2369).getCity());
	}

	@Test
	@DisplayName("Record 2370: County is Hamilton")
	void CountyOfRecord2370() {
		assertEquals("Hamilton", customers.get(2369).getCounty());
	}

	@Test
	@DisplayName("Record 2370: State is OH")
	void StateOfRecord2370() {
		assertEquals("OH", customers.get(2369).getState());
	}

	@Test
	@DisplayName("Record 2370: ZIP is 45202")
	void ZIPOfRecord2370() {
		assertEquals("45202", customers.get(2369).getZIP());
	}

	@Test
	@DisplayName("Record 2370: Phone is 513-241-2679")
	void PhoneOfRecord2370() {
		assertEquals("513-241-2679", customers.get(2369).getPhone());
	}

	@Test
	@DisplayName("Record 2370: Fax is 513-241-2414")
	void FaxOfRecord2370() {
		assertEquals("513-241-2414", customers.get(2369).getFax());
	}

	@Test
	@DisplayName("Record 2370: Email is mac@hugill.com")
	void EmailOfRecord2370() {
		assertEquals("mac@hugill.com", customers.get(2369).getEmail());
	}

	@Test
	@DisplayName("Record 2370: Web is http://www.machugill.com")
	void WebOfRecord2370() {
		assertEquals("http://www.machugill.com", customers.get(2369).getWeb());
	}
}
