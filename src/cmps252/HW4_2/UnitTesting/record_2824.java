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

@Tag("14")
class Record_2824 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2824: FirstName is Warren")
	void FirstNameOfRecord2824() {
		assertEquals("Warren", customers.get(2823).getFirstName());
	}

	@Test
	@DisplayName("Record 2824: LastName is Ditommaso")
	void LastNameOfRecord2824() {
		assertEquals("Ditommaso", customers.get(2823).getLastName());
	}

	@Test
	@DisplayName("Record 2824: Company is Lopez, Stephen E Esq")
	void CompanyOfRecord2824() {
		assertEquals("Lopez, Stephen E Esq", customers.get(2823).getCompany());
	}

	@Test
	@DisplayName("Record 2824: Address is 55 Lafayette St")
	void AddressOfRecord2824() {
		assertEquals("55 Lafayette St", customers.get(2823).getAddress());
	}

	@Test
	@DisplayName("Record 2824: City is Newark")
	void CityOfRecord2824() {
		assertEquals("Newark", customers.get(2823).getCity());
	}

	@Test
	@DisplayName("Record 2824: County is Essex")
	void CountyOfRecord2824() {
		assertEquals("Essex", customers.get(2823).getCounty());
	}

	@Test
	@DisplayName("Record 2824: State is NJ")
	void StateOfRecord2824() {
		assertEquals("NJ", customers.get(2823).getState());
	}

	@Test
	@DisplayName("Record 2824: ZIP is 7102")
	void ZIPOfRecord2824() {
		assertEquals("7102", customers.get(2823).getZIP());
	}

	@Test
	@DisplayName("Record 2824: Phone is 973-623-0191")
	void PhoneOfRecord2824() {
		assertEquals("973-623-0191", customers.get(2823).getPhone());
	}

	@Test
	@DisplayName("Record 2824: Fax is 973-623-3062")
	void FaxOfRecord2824() {
		assertEquals("973-623-3062", customers.get(2823).getFax());
	}

	@Test
	@DisplayName("Record 2824: Email is warren@ditommaso.com")
	void EmailOfRecord2824() {
		assertEquals("warren@ditommaso.com", customers.get(2823).getEmail());
	}

	@Test
	@DisplayName("Record 2824: Web is http://www.warrenditommaso.com")
	void WebOfRecord2824() {
		assertEquals("http://www.warrenditommaso.com", customers.get(2823).getWeb());
	}
}
