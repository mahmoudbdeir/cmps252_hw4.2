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

@Tag("9")
class Record_3764 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3764: FirstName is Lakisha")
	void FirstNameOfRecord3764() {
		assertEquals("Lakisha", customers.get(3763).getFirstName());
	}

	@Test
	@DisplayName("Record 3764: LastName is Mccright")
	void LastNameOfRecord3764() {
		assertEquals("Mccright", customers.get(3763).getLastName());
	}

	@Test
	@DisplayName("Record 3764: Company is D J Introvigne Son Ltd")
	void CompanyOfRecord3764() {
		assertEquals("D J Introvigne Son Ltd", customers.get(3763).getCompany());
	}

	@Test
	@DisplayName("Record 3764: Address is 38 W Mcmicken Ave")
	void AddressOfRecord3764() {
		assertEquals("38 W Mcmicken Ave", customers.get(3763).getAddress());
	}

	@Test
	@DisplayName("Record 3764: City is Cincinnati")
	void CityOfRecord3764() {
		assertEquals("Cincinnati", customers.get(3763).getCity());
	}

	@Test
	@DisplayName("Record 3764: County is Hamilton")
	void CountyOfRecord3764() {
		assertEquals("Hamilton", customers.get(3763).getCounty());
	}

	@Test
	@DisplayName("Record 3764: State is OH")
	void StateOfRecord3764() {
		assertEquals("OH", customers.get(3763).getState());
	}

	@Test
	@DisplayName("Record 3764: ZIP is 45210")
	void ZIPOfRecord3764() {
		assertEquals("45210", customers.get(3763).getZIP());
	}

	@Test
	@DisplayName("Record 3764: Phone is 513-241-1918")
	void PhoneOfRecord3764() {
		assertEquals("513-241-1918", customers.get(3763).getPhone());
	}

	@Test
	@DisplayName("Record 3764: Fax is 513-241-5451")
	void FaxOfRecord3764() {
		assertEquals("513-241-5451", customers.get(3763).getFax());
	}

	@Test
	@DisplayName("Record 3764: Email is lakisha@mccright.com")
	void EmailOfRecord3764() {
		assertEquals("lakisha@mccright.com", customers.get(3763).getEmail());
	}

	@Test
	@DisplayName("Record 3764: Web is http://www.lakishamccright.com")
	void WebOfRecord3764() {
		assertEquals("http://www.lakishamccright.com", customers.get(3763).getWeb());
	}
}
