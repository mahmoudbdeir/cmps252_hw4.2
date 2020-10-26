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
class Record_2944 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2944: FirstName is Aurelia")
	void FirstNameOfRecord2944() {
		assertEquals("Aurelia", customers.get(2943).getFirstName());
	}

	@Test
	@DisplayName("Record 2944: LastName is Stinser")
	void LastNameOfRecord2944() {
		assertEquals("Stinser", customers.get(2943).getLastName());
	}

	@Test
	@DisplayName("Record 2944: Company is Aurora Woodlands Resrt")
	void CompanyOfRecord2944() {
		assertEquals("Aurora Woodlands Resrt", customers.get(2943).getCompany());
	}

	@Test
	@DisplayName("Record 2944: Address is 70 N Catalina Ave")
	void AddressOfRecord2944() {
		assertEquals("70 N Catalina Ave", customers.get(2943).getAddress());
	}

	@Test
	@DisplayName("Record 2944: City is Pasadena")
	void CityOfRecord2944() {
		assertEquals("Pasadena", customers.get(2943).getCity());
	}

	@Test
	@DisplayName("Record 2944: County is Los Angeles")
	void CountyOfRecord2944() {
		assertEquals("Los Angeles", customers.get(2943).getCounty());
	}

	@Test
	@DisplayName("Record 2944: State is CA")
	void StateOfRecord2944() {
		assertEquals("CA", customers.get(2943).getState());
	}

	@Test
	@DisplayName("Record 2944: ZIP is 91106")
	void ZIPOfRecord2944() {
		assertEquals("91106", customers.get(2943).getZIP());
	}

	@Test
	@DisplayName("Record 2944: Phone is 626-796-8267")
	void PhoneOfRecord2944() {
		assertEquals("626-796-8267", customers.get(2943).getPhone());
	}

	@Test
	@DisplayName("Record 2944: Fax is 626-796-0265")
	void FaxOfRecord2944() {
		assertEquals("626-796-0265", customers.get(2943).getFax());
	}

	@Test
	@DisplayName("Record 2944: Email is aurelia@stinser.com")
	void EmailOfRecord2944() {
		assertEquals("aurelia@stinser.com", customers.get(2943).getEmail());
	}

	@Test
	@DisplayName("Record 2944: Web is http://www.aureliastinser.com")
	void WebOfRecord2944() {
		assertEquals("http://www.aureliastinser.com", customers.get(2943).getWeb());
	}
}
