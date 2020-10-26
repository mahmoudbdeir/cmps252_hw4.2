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

@Tag("40")
class Record_9 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 9: FirstName is Linda")
	void FirstNameOfRecord9() {
		assertEquals("Linda", customers.get(8).getFirstName());
	}

	@Test
	@DisplayName("Record 9: LastName is Golda")
	void LastNameOfRecord9() {
		assertEquals("Golda", customers.get(8).getLastName());
	}

	@Test
	@DisplayName("Record 9: Company is Parham, J Randolph Esq")
	void CompanyOfRecord9() {
		assertEquals("Parham, J Randolph Esq", customers.get(8).getCompany());
	}

	@Test
	@DisplayName("Record 9: Address is 60 Monroe Center St Nw")
	void AddressOfRecord9() {
		assertEquals("60 Monroe Center St Nw", customers.get(8).getAddress());
	}

	@Test
	@DisplayName("Record 9: City is Grand Rapids")
	void CityOfRecord9() {
		assertEquals("Grand Rapids", customers.get(8).getCity());
	}

	@Test
	@DisplayName("Record 9: County is Kent")
	void CountyOfRecord9() {
		assertEquals("Kent", customers.get(8).getCounty());
	}

	@Test
	@DisplayName("Record 9: State is MI")
	void StateOfRecord9() {
		assertEquals("MI", customers.get(8).getState());
	}

	@Test
	@DisplayName("Record 9: ZIP is 49503")
	void ZIPOfRecord9() {
		assertEquals("49503", customers.get(8).getZIP());
	}

	@Test
	@DisplayName("Record 9: Phone is 616-451-2797")
	void PhoneOfRecord9() {
		assertEquals("616-451-2797", customers.get(8).getPhone());
	}

	@Test
	@DisplayName("Record 9: Fax is 616-451-4218")
	void FaxOfRecord9() {
		assertEquals("616-451-4218", customers.get(8).getFax());
	}

	@Test
	@DisplayName("Record 9: Email is linda@golda.com")
	void EmailOfRecord9() {
		assertEquals("linda@golda.com", customers.get(8).getEmail());
	}

	@Test
	@DisplayName("Record 9: Web is http://www.lindagolda.com")
	void WebOfRecord9() {
		assertEquals("http://www.lindagolda.com", customers.get(8).getWeb());
	}
}
