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

@Tag("17")
class Record_2246 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2246: FirstName is Ike")
	void FirstNameOfRecord2246() {
		assertEquals("Ike", customers.get(2245).getFirstName());
	}

	@Test
	@DisplayName("Record 2246: LastName is Petershym")
	void LastNameOfRecord2246() {
		assertEquals("Petershym", customers.get(2245).getLastName());
	}

	@Test
	@DisplayName("Record 2246: Company is Autumn Construction Inc")
	void CompanyOfRecord2246() {
		assertEquals("Autumn Construction Inc", customers.get(2245).getCompany());
	}

	@Test
	@DisplayName("Record 2246: Address is 3812 W 51st St")
	void AddressOfRecord2246() {
		assertEquals("3812 W 51st St", customers.get(2245).getAddress());
	}

	@Test
	@DisplayName("Record 2246: City is Minneapolis")
	void CityOfRecord2246() {
		assertEquals("Minneapolis", customers.get(2245).getCity());
	}

	@Test
	@DisplayName("Record 2246: County is Hennepin")
	void CountyOfRecord2246() {
		assertEquals("Hennepin", customers.get(2245).getCounty());
	}

	@Test
	@DisplayName("Record 2246: State is MN")
	void StateOfRecord2246() {
		assertEquals("MN", customers.get(2245).getState());
	}

	@Test
	@DisplayName("Record 2246: ZIP is 55410")
	void ZIPOfRecord2246() {
		assertEquals("55410", customers.get(2245).getZIP());
	}

	@Test
	@DisplayName("Record 2246: Phone is 612-925-8985")
	void PhoneOfRecord2246() {
		assertEquals("612-925-8985", customers.get(2245).getPhone());
	}

	@Test
	@DisplayName("Record 2246: Fax is 612-925-3718")
	void FaxOfRecord2246() {
		assertEquals("612-925-3718", customers.get(2245).getFax());
	}

	@Test
	@DisplayName("Record 2246: Email is ike@petershym.com")
	void EmailOfRecord2246() {
		assertEquals("ike@petershym.com", customers.get(2245).getEmail());
	}

	@Test
	@DisplayName("Record 2246: Web is http://www.ikepetershym.com")
	void WebOfRecord2246() {
		assertEquals("http://www.ikepetershym.com", customers.get(2245).getWeb());
	}
}
