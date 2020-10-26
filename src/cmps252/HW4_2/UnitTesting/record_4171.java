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

@Tag("35")
class Record_4171 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4171: FirstName is Peter")
	void FirstNameOfRecord4171() {
		assertEquals("Peter", customers.get(4170).getFirstName());
	}

	@Test
	@DisplayName("Record 4171: LastName is Bramson")
	void LastNameOfRecord4171() {
		assertEquals("Bramson", customers.get(4170).getLastName());
	}

	@Test
	@DisplayName("Record 4171: Company is Montgomery County Lgl Aid Svc")
	void CompanyOfRecord4171() {
		assertEquals("Montgomery County Lgl Aid Svc", customers.get(4170).getCompany());
	}

	@Test
	@DisplayName("Record 4171: Address is 1312 Basin Ave")
	void AddressOfRecord4171() {
		assertEquals("1312 Basin Ave", customers.get(4170).getAddress());
	}

	@Test
	@DisplayName("Record 4171: City is Bismarck")
	void CityOfRecord4171() {
		assertEquals("Bismarck", customers.get(4170).getCity());
	}

	@Test
	@DisplayName("Record 4171: County is Burlygh")
	void CountyOfRecord4171() {
		assertEquals("Burlygh", customers.get(4170).getCounty());
	}

	@Test
	@DisplayName("Record 4171: State is ND")
	void StateOfRecord4171() {
		assertEquals("ND", customers.get(4170).getState());
	}

	@Test
	@DisplayName("Record 4171: ZIP is 58504")
	void ZIPOfRecord4171() {
		assertEquals("58504", customers.get(4170).getZIP());
	}

	@Test
	@DisplayName("Record 4171: Phone is 701-258-4296")
	void PhoneOfRecord4171() {
		assertEquals("701-258-4296", customers.get(4170).getPhone());
	}

	@Test
	@DisplayName("Record 4171: Fax is 701-258-2358")
	void FaxOfRecord4171() {
		assertEquals("701-258-2358", customers.get(4170).getFax());
	}

	@Test
	@DisplayName("Record 4171: Email is peter@bramson.com")
	void EmailOfRecord4171() {
		assertEquals("peter@bramson.com", customers.get(4170).getEmail());
	}

	@Test
	@DisplayName("Record 4171: Web is http://www.peterbramson.com")
	void WebOfRecord4171() {
		assertEquals("http://www.peterbramson.com", customers.get(4170).getWeb());
	}
}
