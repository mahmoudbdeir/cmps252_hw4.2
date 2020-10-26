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

@Tag("23")
class Record_1841 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1841: FirstName is Mellissa")
	void FirstNameOfRecord1841() {
		assertEquals("Mellissa", customers.get(1840).getFirstName());
	}

	@Test
	@DisplayName("Record 1841: LastName is Yost")
	void LastNameOfRecord1841() {
		assertEquals("Yost", customers.get(1840).getLastName());
	}

	@Test
	@DisplayName("Record 1841: Company is Loveless Machine & Grinding")
	void CompanyOfRecord1841() {
		assertEquals("Loveless Machine & Grinding", customers.get(1840).getCompany());
	}

	@Test
	@DisplayName("Record 1841: Address is 1217 Oak St")
	void AddressOfRecord1841() {
		assertEquals("1217 Oak St", customers.get(1840).getAddress());
	}

	@Test
	@DisplayName("Record 1841: City is Bloomer")
	void CityOfRecord1841() {
		assertEquals("Bloomer", customers.get(1840).getCity());
	}

	@Test
	@DisplayName("Record 1841: County is Chippewa")
	void CountyOfRecord1841() {
		assertEquals("Chippewa", customers.get(1840).getCounty());
	}

	@Test
	@DisplayName("Record 1841: State is WI")
	void StateOfRecord1841() {
		assertEquals("WI", customers.get(1840).getState());
	}

	@Test
	@DisplayName("Record 1841: ZIP is 54724")
	void ZIPOfRecord1841() {
		assertEquals("54724", customers.get(1840).getZIP());
	}

	@Test
	@DisplayName("Record 1841: Phone is 715-568-7073")
	void PhoneOfRecord1841() {
		assertEquals("715-568-7073", customers.get(1840).getPhone());
	}

	@Test
	@DisplayName("Record 1841: Fax is 715-568-9063")
	void FaxOfRecord1841() {
		assertEquals("715-568-9063", customers.get(1840).getFax());
	}

	@Test
	@DisplayName("Record 1841: Email is mellissa@yost.com")
	void EmailOfRecord1841() {
		assertEquals("mellissa@yost.com", customers.get(1840).getEmail());
	}

	@Test
	@DisplayName("Record 1841: Web is http://www.mellissayost.com")
	void WebOfRecord1841() {
		assertEquals("http://www.mellissayost.com", customers.get(1840).getWeb());
	}
}
