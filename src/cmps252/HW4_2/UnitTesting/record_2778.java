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

@Tag("0")
class Record_2778 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2778: FirstName is Maryanne")
	void FirstNameOfRecord2778() {
		assertEquals("Maryanne", customers.get(2777).getFirstName());
	}

	@Test
	@DisplayName("Record 2778: LastName is Delk")
	void LastNameOfRecord2778() {
		assertEquals("Delk", customers.get(2777).getLastName());
	}

	@Test
	@DisplayName("Record 2778: Company is American Speedy Printing Ctrs")
	void CompanyOfRecord2778() {
		assertEquals("American Speedy Printing Ctrs", customers.get(2777).getCompany());
	}

	@Test
	@DisplayName("Record 2778: Address is 4825 W Grand Ave")
	void AddressOfRecord2778() {
		assertEquals("4825 W Grand Ave", customers.get(2777).getAddress());
	}

	@Test
	@DisplayName("Record 2778: City is Chicago")
	void CityOfRecord2778() {
		assertEquals("Chicago", customers.get(2777).getCity());
	}

	@Test
	@DisplayName("Record 2778: County is Cook")
	void CountyOfRecord2778() {
		assertEquals("Cook", customers.get(2777).getCounty());
	}

	@Test
	@DisplayName("Record 2778: State is IL")
	void StateOfRecord2778() {
		assertEquals("IL", customers.get(2777).getState());
	}

	@Test
	@DisplayName("Record 2778: ZIP is 60639")
	void ZIPOfRecord2778() {
		assertEquals("60639", customers.get(2777).getZIP());
	}

	@Test
	@DisplayName("Record 2778: Phone is 773-745-0267")
	void PhoneOfRecord2778() {
		assertEquals("773-745-0267", customers.get(2777).getPhone());
	}

	@Test
	@DisplayName("Record 2778: Fax is 773-745-1114")
	void FaxOfRecord2778() {
		assertEquals("773-745-1114", customers.get(2777).getFax());
	}

	@Test
	@DisplayName("Record 2778: Email is maryanne@delk.com")
	void EmailOfRecord2778() {
		assertEquals("maryanne@delk.com", customers.get(2777).getEmail());
	}

	@Test
	@DisplayName("Record 2778: Web is http://www.maryannedelk.com")
	void WebOfRecord2778() {
		assertEquals("http://www.maryannedelk.com", customers.get(2777).getWeb());
	}
}
