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

@Tag("31")
class Record_4701 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4701: FirstName is Timothy")
	void FirstNameOfRecord4701() {
		assertEquals("Timothy", customers.get(4700).getFirstName());
	}

	@Test
	@DisplayName("Record 4701: LastName is Seawell")
	void LastNameOfRecord4701() {
		assertEquals("Seawell", customers.get(4700).getLastName());
	}

	@Test
	@DisplayName("Record 4701: Company is Wal Mart Disc Cities Str Info")
	void CompanyOfRecord4701() {
		assertEquals("Wal Mart Disc Cities Str Info", customers.get(4700).getCompany());
	}

	@Test
	@DisplayName("Record 4701: Address is 20 Brooklyn Ave")
	void AddressOfRecord4701() {
		assertEquals("20 Brooklyn Ave", customers.get(4700).getAddress());
	}

	@Test
	@DisplayName("Record 4701: City is Massapequa")
	void CityOfRecord4701() {
		assertEquals("Massapequa", customers.get(4700).getCity());
	}

	@Test
	@DisplayName("Record 4701: County is Nassau")
	void CountyOfRecord4701() {
		assertEquals("Nassau", customers.get(4700).getCounty());
	}

	@Test
	@DisplayName("Record 4701: State is NY")
	void StateOfRecord4701() {
		assertEquals("NY", customers.get(4700).getState());
	}

	@Test
	@DisplayName("Record 4701: ZIP is 11758")
	void ZIPOfRecord4701() {
		assertEquals("11758", customers.get(4700).getZIP());
	}

	@Test
	@DisplayName("Record 4701: Phone is 516-541-5376")
	void PhoneOfRecord4701() {
		assertEquals("516-541-5376", customers.get(4700).getPhone());
	}

	@Test
	@DisplayName("Record 4701: Fax is 516-541-8563")
	void FaxOfRecord4701() {
		assertEquals("516-541-8563", customers.get(4700).getFax());
	}

	@Test
	@DisplayName("Record 4701: Email is timothy@seawell.com")
	void EmailOfRecord4701() {
		assertEquals("timothy@seawell.com", customers.get(4700).getEmail());
	}

	@Test
	@DisplayName("Record 4701: Web is http://www.timothyseawell.com")
	void WebOfRecord4701() {
		assertEquals("http://www.timothyseawell.com", customers.get(4700).getWeb());
	}
}
