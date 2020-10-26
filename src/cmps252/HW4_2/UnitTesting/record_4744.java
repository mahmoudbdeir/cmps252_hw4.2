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
class Record_4744 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4744: FirstName is Melinda")
	void FirstNameOfRecord4744() {
		assertEquals("Melinda", customers.get(4743).getFirstName());
	}

	@Test
	@DisplayName("Record 4744: LastName is Williby")
	void LastNameOfRecord4744() {
		assertEquals("Williby", customers.get(4743).getLastName());
	}

	@Test
	@DisplayName("Record 4744: Company is Binghamton Knitting Co Inc")
	void CompanyOfRecord4744() {
		assertEquals("Binghamton Knitting Co Inc", customers.get(4743).getCompany());
	}

	@Test
	@DisplayName("Record 4744: Address is 11310 Tamarco Dr")
	void AddressOfRecord4744() {
		assertEquals("11310 Tamarco Dr", customers.get(4743).getAddress());
	}

	@Test
	@DisplayName("Record 4744: City is Cincinnati")
	void CityOfRecord4744() {
		assertEquals("Cincinnati", customers.get(4743).getCity());
	}

	@Test
	@DisplayName("Record 4744: County is Hamilton")
	void CountyOfRecord4744() {
		assertEquals("Hamilton", customers.get(4743).getCounty());
	}

	@Test
	@DisplayName("Record 4744: State is OH")
	void StateOfRecord4744() {
		assertEquals("OH", customers.get(4743).getState());
	}

	@Test
	@DisplayName("Record 4744: ZIP is 45242")
	void ZIPOfRecord4744() {
		assertEquals("45242", customers.get(4743).getZIP());
	}

	@Test
	@DisplayName("Record 4744: Phone is 513-489-4836")
	void PhoneOfRecord4744() {
		assertEquals("513-489-4836", customers.get(4743).getPhone());
	}

	@Test
	@DisplayName("Record 4744: Fax is 513-489-1449")
	void FaxOfRecord4744() {
		assertEquals("513-489-1449", customers.get(4743).getFax());
	}

	@Test
	@DisplayName("Record 4744: Email is melinda@williby.com")
	void EmailOfRecord4744() {
		assertEquals("melinda@williby.com", customers.get(4743).getEmail());
	}

	@Test
	@DisplayName("Record 4744: Web is http://www.melindawilliby.com")
	void WebOfRecord4744() {
		assertEquals("http://www.melindawilliby.com", customers.get(4743).getWeb());
	}
}
