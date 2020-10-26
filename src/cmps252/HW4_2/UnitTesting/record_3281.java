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

@Tag("7")
class Record_3281 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3281: FirstName is Birdie")
	void FirstNameOfRecord3281() {
		assertEquals("Birdie", customers.get(3280).getFirstName());
	}

	@Test
	@DisplayName("Record 3281: LastName is Bobsyne")
	void LastNameOfRecord3281() {
		assertEquals("Bobsyne", customers.get(3280).getLastName());
	}

	@Test
	@DisplayName("Record 3281: Company is Vince Meccas World Cstm Cbntry")
	void CompanyOfRecord3281() {
		assertEquals("Vince Meccas World Cstm Cbntry", customers.get(3280).getCompany());
	}

	@Test
	@DisplayName("Record 3281: Address is 174 Buena Vista Ave")
	void AddressOfRecord3281() {
		assertEquals("174 Buena Vista Ave", customers.get(3280).getAddress());
	}

	@Test
	@DisplayName("Record 3281: City is Yonkers")
	void CityOfRecord3281() {
		assertEquals("Yonkers", customers.get(3280).getCity());
	}

	@Test
	@DisplayName("Record 3281: County is Westchester")
	void CountyOfRecord3281() {
		assertEquals("Westchester", customers.get(3280).getCounty());
	}

	@Test
	@DisplayName("Record 3281: State is NY")
	void StateOfRecord3281() {
		assertEquals("NY", customers.get(3280).getState());
	}

	@Test
	@DisplayName("Record 3281: ZIP is 10701")
	void ZIPOfRecord3281() {
		assertEquals("10701", customers.get(3280).getZIP());
	}

	@Test
	@DisplayName("Record 3281: Phone is 914-969-4422")
	void PhoneOfRecord3281() {
		assertEquals("914-969-4422", customers.get(3280).getPhone());
	}

	@Test
	@DisplayName("Record 3281: Fax is 914-969-1817")
	void FaxOfRecord3281() {
		assertEquals("914-969-1817", customers.get(3280).getFax());
	}

	@Test
	@DisplayName("Record 3281: Email is birdie@bobsyne.com")
	void EmailOfRecord3281() {
		assertEquals("birdie@bobsyne.com", customers.get(3280).getEmail());
	}

	@Test
	@DisplayName("Record 3281: Web is http://www.birdiebobsyne.com")
	void WebOfRecord3281() {
		assertEquals("http://www.birdiebobsyne.com", customers.get(3280).getWeb());
	}
}
