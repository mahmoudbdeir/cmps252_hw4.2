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
class Record_4182 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4182: FirstName is Earnest")
	void FirstNameOfRecord4182() {
		assertEquals("Earnest", customers.get(4181).getFirstName());
	}

	@Test
	@DisplayName("Record 4182: LastName is Bramhall")
	void LastNameOfRecord4182() {
		assertEquals("Bramhall", customers.get(4181).getLastName());
	}

	@Test
	@DisplayName("Record 4182: Company is Bakery Basket")
	void CompanyOfRecord4182() {
		assertEquals("Bakery Basket", customers.get(4181).getCompany());
	}

	@Test
	@DisplayName("Record 4182: Address is 321 Settlers Rd")
	void AddressOfRecord4182() {
		assertEquals("321 Settlers Rd", customers.get(4181).getAddress());
	}

	@Test
	@DisplayName("Record 4182: City is Holland")
	void CityOfRecord4182() {
		assertEquals("Holland", customers.get(4181).getCity());
	}

	@Test
	@DisplayName("Record 4182: County is Ottawa")
	void CountyOfRecord4182() {
		assertEquals("Ottawa", customers.get(4181).getCounty());
	}

	@Test
	@DisplayName("Record 4182: State is MI")
	void StateOfRecord4182() {
		assertEquals("MI", customers.get(4181).getState());
	}

	@Test
	@DisplayName("Record 4182: ZIP is 49423")
	void ZIPOfRecord4182() {
		assertEquals("49423", customers.get(4181).getZIP());
	}

	@Test
	@DisplayName("Record 4182: Phone is 616-392-4376")
	void PhoneOfRecord4182() {
		assertEquals("616-392-4376", customers.get(4181).getPhone());
	}

	@Test
	@DisplayName("Record 4182: Fax is 616-392-8407")
	void FaxOfRecord4182() {
		assertEquals("616-392-8407", customers.get(4181).getFax());
	}

	@Test
	@DisplayName("Record 4182: Email is earnest@bramhall.com")
	void EmailOfRecord4182() {
		assertEquals("earnest@bramhall.com", customers.get(4181).getEmail());
	}

	@Test
	@DisplayName("Record 4182: Web is http://www.earnestbramhall.com")
	void WebOfRecord4182() {
		assertEquals("http://www.earnestbramhall.com", customers.get(4181).getWeb());
	}
}
