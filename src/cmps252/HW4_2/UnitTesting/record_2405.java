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

@Tag("15")
class Record_2405 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2405: FirstName is Racheal")
	void FirstNameOfRecord2405() {
		assertEquals("Racheal", customers.get(2404).getFirstName());
	}

	@Test
	@DisplayName("Record 2405: LastName is Hulick")
	void LastNameOfRecord2405() {
		assertEquals("Hulick", customers.get(2404).getLastName());
	}

	@Test
	@DisplayName("Record 2405: Company is Dabney, John C Jr")
	void CompanyOfRecord2405() {
		assertEquals("Dabney, John C Jr", customers.get(2404).getCompany());
	}

	@Test
	@DisplayName("Record 2405: Address is 1153 Alabama Rd")
	void AddressOfRecord2405() {
		assertEquals("1153 Alabama Rd", customers.get(2404).getAddress());
	}

	@Test
	@DisplayName("Record 2405: City is Acworth")
	void CityOfRecord2405() {
		assertEquals("Acworth", customers.get(2404).getCity());
	}

	@Test
	@DisplayName("Record 2405: County is Cherokee")
	void CountyOfRecord2405() {
		assertEquals("Cherokee", customers.get(2404).getCounty());
	}

	@Test
	@DisplayName("Record 2405: State is GA")
	void StateOfRecord2405() {
		assertEquals("GA", customers.get(2404).getState());
	}

	@Test
	@DisplayName("Record 2405: ZIP is 30102")
	void ZIPOfRecord2405() {
		assertEquals("30102", customers.get(2404).getZIP());
	}

	@Test
	@DisplayName("Record 2405: Phone is 770-924-7820")
	void PhoneOfRecord2405() {
		assertEquals("770-924-7820", customers.get(2404).getPhone());
	}

	@Test
	@DisplayName("Record 2405: Fax is 770-924-6767")
	void FaxOfRecord2405() {
		assertEquals("770-924-6767", customers.get(2404).getFax());
	}

	@Test
	@DisplayName("Record 2405: Email is racheal@hulick.com")
	void EmailOfRecord2405() {
		assertEquals("racheal@hulick.com", customers.get(2404).getEmail());
	}

	@Test
	@DisplayName("Record 2405: Web is http://www.rachealhulick.com")
	void WebOfRecord2405() {
		assertEquals("http://www.rachealhulick.com", customers.get(2404).getWeb());
	}
}
