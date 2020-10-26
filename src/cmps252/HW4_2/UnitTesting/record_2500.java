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
class Record_2500 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2500: FirstName is Eli")
	void FirstNameOfRecord2500() {
		assertEquals("Eli", customers.get(2499).getFirstName());
	}

	@Test
	@DisplayName("Record 2500: LastName is Dwyar")
	void LastNameOfRecord2500() {
		assertEquals("Dwyar", customers.get(2499).getLastName());
	}

	@Test
	@DisplayName("Record 2500: Company is Prigoff, Milton Esq")
	void CompanyOfRecord2500() {
		assertEquals("Prigoff, Milton Esq", customers.get(2499).getCompany());
	}

	@Test
	@DisplayName("Record 2500: Address is 7070 Potomac Dr")
	void AddressOfRecord2500() {
		assertEquals("7070 Potomac Dr", customers.get(2499).getAddress());
	}

	@Test
	@DisplayName("Record 2500: City is Boise")
	void CityOfRecord2500() {
		assertEquals("Boise", customers.get(2499).getCity());
	}

	@Test
	@DisplayName("Record 2500: County is Ada")
	void CountyOfRecord2500() {
		assertEquals("Ada", customers.get(2499).getCounty());
	}

	@Test
	@DisplayName("Record 2500: State is ID")
	void StateOfRecord2500() {
		assertEquals("ID", customers.get(2499).getState());
	}

	@Test
	@DisplayName("Record 2500: ZIP is 83704")
	void ZIPOfRecord2500() {
		assertEquals("83704", customers.get(2499).getZIP());
	}

	@Test
	@DisplayName("Record 2500: Phone is 208-322-3698")
	void PhoneOfRecord2500() {
		assertEquals("208-322-3698", customers.get(2499).getPhone());
	}

	@Test
	@DisplayName("Record 2500: Fax is 208-322-0668")
	void FaxOfRecord2500() {
		assertEquals("208-322-0668", customers.get(2499).getFax());
	}

	@Test
	@DisplayName("Record 2500: Email is eli@dwyar.com")
	void EmailOfRecord2500() {
		assertEquals("eli@dwyar.com", customers.get(2499).getEmail());
	}

	@Test
	@DisplayName("Record 2500: Web is http://www.elidwyar.com")
	void WebOfRecord2500() {
		assertEquals("http://www.elidwyar.com", customers.get(2499).getWeb());
	}
}
