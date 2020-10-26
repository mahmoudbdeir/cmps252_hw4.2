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

@Tag("28")
class Record_2874 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2874: FirstName is Ted")
	void FirstNameOfRecord2874() {
		assertEquals("Ted", customers.get(2873).getFirstName());
	}

	@Test
	@DisplayName("Record 2874: LastName is Kyger")
	void LastNameOfRecord2874() {
		assertEquals("Kyger", customers.get(2873).getLastName());
	}

	@Test
	@DisplayName("Record 2874: Company is Jordan, Karl J Cpa")
	void CompanyOfRecord2874() {
		assertEquals("Jordan, Karl J Cpa", customers.get(2873).getCompany());
	}

	@Test
	@DisplayName("Record 2874: Address is 550 N Main St")
	void AddressOfRecord2874() {
		assertEquals("550 N Main St", customers.get(2873).getAddress());
	}

	@Test
	@DisplayName("Record 2874: City is Doylestown")
	void CityOfRecord2874() {
		assertEquals("Doylestown", customers.get(2873).getCity());
	}

	@Test
	@DisplayName("Record 2874: County is Bucks")
	void CountyOfRecord2874() {
		assertEquals("Bucks", customers.get(2873).getCounty());
	}

	@Test
	@DisplayName("Record 2874: State is PA")
	void StateOfRecord2874() {
		assertEquals("PA", customers.get(2873).getState());
	}

	@Test
	@DisplayName("Record 2874: ZIP is 18901")
	void ZIPOfRecord2874() {
		assertEquals("18901", customers.get(2873).getZIP());
	}

	@Test
	@DisplayName("Record 2874: Phone is 215-348-0408")
	void PhoneOfRecord2874() {
		assertEquals("215-348-0408", customers.get(2873).getPhone());
	}

	@Test
	@DisplayName("Record 2874: Fax is 215-348-3285")
	void FaxOfRecord2874() {
		assertEquals("215-348-3285", customers.get(2873).getFax());
	}

	@Test
	@DisplayName("Record 2874: Email is ted@kyger.com")
	void EmailOfRecord2874() {
		assertEquals("ted@kyger.com", customers.get(2873).getEmail());
	}

	@Test
	@DisplayName("Record 2874: Web is http://www.tedkyger.com")
	void WebOfRecord2874() {
		assertEquals("http://www.tedkyger.com", customers.get(2873).getWeb());
	}
}
