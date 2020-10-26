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

@Tag("18")
class Record_726 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 726: FirstName is Janette")
	void FirstNameOfRecord726() {
		assertEquals("Janette", customers.get(725).getFirstName());
	}

	@Test
	@DisplayName("Record 726: LastName is Trader")
	void LastNameOfRecord726() {
		assertEquals("Trader", customers.get(725).getLastName());
	}

	@Test
	@DisplayName("Record 726: Company is Pecchio, Robert A Esq")
	void CompanyOfRecord726() {
		assertEquals("Pecchio, Robert A Esq", customers.get(725).getCompany());
	}

	@Test
	@DisplayName("Record 726: Address is 74 Main St")
	void AddressOfRecord726() {
		assertEquals("74 Main St", customers.get(725).getAddress());
	}

	@Test
	@DisplayName("Record 726: City is Woodbridge")
	void CityOfRecord726() {
		assertEquals("Woodbridge", customers.get(725).getCity());
	}

	@Test
	@DisplayName("Record 726: County is Middlesex")
	void CountyOfRecord726() {
		assertEquals("Middlesex", customers.get(725).getCounty());
	}

	@Test
	@DisplayName("Record 726: State is NJ")
	void StateOfRecord726() {
		assertEquals("NJ", customers.get(725).getState());
	}

	@Test
	@DisplayName("Record 726: ZIP is 7095")
	void ZIPOfRecord726() {
		assertEquals("7095", customers.get(725).getZIP());
	}

	@Test
	@DisplayName("Record 726: Phone is 732-634-4647")
	void PhoneOfRecord726() {
		assertEquals("732-634-4647", customers.get(725).getPhone());
	}

	@Test
	@DisplayName("Record 726: Fax is 732-634-9977")
	void FaxOfRecord726() {
		assertEquals("732-634-9977", customers.get(725).getFax());
	}

	@Test
	@DisplayName("Record 726: Email is janette@trader.com")
	void EmailOfRecord726() {
		assertEquals("janette@trader.com", customers.get(725).getEmail());
	}

	@Test
	@DisplayName("Record 726: Web is http://www.janettetrader.com")
	void WebOfRecord726() {
		assertEquals("http://www.janettetrader.com", customers.get(725).getWeb());
	}
}
