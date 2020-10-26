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

@Tag("26")
class Record_3755 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3755: FirstName is Alton")
	void FirstNameOfRecord3755() {
		assertEquals("Alton", customers.get(3754).getFirstName());
	}

	@Test
	@DisplayName("Record 3755: LastName is Mccrimmon")
	void LastNameOfRecord3755() {
		assertEquals("Mccrimmon", customers.get(3754).getLastName());
	}

	@Test
	@DisplayName("Record 3755: Company is Cunningham Amann & Burke Pc")
	void CompanyOfRecord3755() {
		assertEquals("Cunningham Amann & Burke Pc", customers.get(3754).getCompany());
	}

	@Test
	@DisplayName("Record 3755: Address is 3001 Fiechtner Dr")
	void AddressOfRecord3755() {
		assertEquals("3001 Fiechtner Dr", customers.get(3754).getAddress());
	}

	@Test
	@DisplayName("Record 3755: City is Fargo")
	void CityOfRecord3755() {
		assertEquals("Fargo", customers.get(3754).getCity());
	}

	@Test
	@DisplayName("Record 3755: County is Cass")
	void CountyOfRecord3755() {
		assertEquals("Cass", customers.get(3754).getCounty());
	}

	@Test
	@DisplayName("Record 3755: State is ND")
	void StateOfRecord3755() {
		assertEquals("ND", customers.get(3754).getState());
	}

	@Test
	@DisplayName("Record 3755: ZIP is 58103")
	void ZIPOfRecord3755() {
		assertEquals("58103", customers.get(3754).getZIP());
	}

	@Test
	@DisplayName("Record 3755: Phone is 701-293-0848")
	void PhoneOfRecord3755() {
		assertEquals("701-293-0848", customers.get(3754).getPhone());
	}

	@Test
	@DisplayName("Record 3755: Fax is 701-293-1171")
	void FaxOfRecord3755() {
		assertEquals("701-293-1171", customers.get(3754).getFax());
	}

	@Test
	@DisplayName("Record 3755: Email is alton@mccrimmon.com")
	void EmailOfRecord3755() {
		assertEquals("alton@mccrimmon.com", customers.get(3754).getEmail());
	}

	@Test
	@DisplayName("Record 3755: Web is http://www.altonmccrimmon.com")
	void WebOfRecord3755() {
		assertEquals("http://www.altonmccrimmon.com", customers.get(3754).getWeb());
	}
}
