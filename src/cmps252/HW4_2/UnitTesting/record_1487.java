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

@Tag("30")
class Record_1487 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1487: FirstName is Cornell")
	void FirstNameOfRecord1487() {
		assertEquals("Cornell", customers.get(1486).getFirstName());
	}

	@Test
	@DisplayName("Record 1487: LastName is Hoschander")
	void LastNameOfRecord1487() {
		assertEquals("Hoschander", customers.get(1486).getLastName());
	}

	@Test
	@DisplayName("Record 1487: Company is Macrosearch")
	void CompanyOfRecord1487() {
		assertEquals("Macrosearch", customers.get(1486).getCompany());
	}

	@Test
	@DisplayName("Record 1487: Address is 224 Pegasus Ave")
	void AddressOfRecord1487() {
		assertEquals("224 Pegasus Ave", customers.get(1486).getAddress());
	}

	@Test
	@DisplayName("Record 1487: City is Northvale")
	void CityOfRecord1487() {
		assertEquals("Northvale", customers.get(1486).getCity());
	}

	@Test
	@DisplayName("Record 1487: County is Bergen")
	void CountyOfRecord1487() {
		assertEquals("Bergen", customers.get(1486).getCounty());
	}

	@Test
	@DisplayName("Record 1487: State is NJ")
	void StateOfRecord1487() {
		assertEquals("NJ", customers.get(1486).getState());
	}

	@Test
	@DisplayName("Record 1487: ZIP is 7647")
	void ZIPOfRecord1487() {
		assertEquals("7647", customers.get(1486).getZIP());
	}

	@Test
	@DisplayName("Record 1487: Phone is 201-784-3918")
	void PhoneOfRecord1487() {
		assertEquals("201-784-3918", customers.get(1486).getPhone());
	}

	@Test
	@DisplayName("Record 1487: Fax is 201-784-9752")
	void FaxOfRecord1487() {
		assertEquals("201-784-9752", customers.get(1486).getFax());
	}

	@Test
	@DisplayName("Record 1487: Email is cornell@hoschander.com")
	void EmailOfRecord1487() {
		assertEquals("cornell@hoschander.com", customers.get(1486).getEmail());
	}

	@Test
	@DisplayName("Record 1487: Web is http://www.cornellhoschander.com")
	void WebOfRecord1487() {
		assertEquals("http://www.cornellhoschander.com", customers.get(1486).getWeb());
	}
}
