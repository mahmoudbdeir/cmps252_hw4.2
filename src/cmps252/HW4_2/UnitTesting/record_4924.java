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

@Tag("35")
class Record_4924 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4924: FirstName is Leanne")
	void FirstNameOfRecord4924() {
		assertEquals("Leanne", customers.get(4923).getFirstName());
	}

	@Test
	@DisplayName("Record 4924: LastName is Tikkanen")
	void LastNameOfRecord4924() {
		assertEquals("Tikkanen", customers.get(4923).getLastName());
	}

	@Test
	@DisplayName("Record 4924: Company is M A Bongiovanni Inc")
	void CompanyOfRecord4924() {
		assertEquals("M A Bongiovanni Inc", customers.get(4923).getCompany());
	}

	@Test
	@DisplayName("Record 4924: Address is 1150 1st Ave")
	void AddressOfRecord4924() {
		assertEquals("1150 1st Ave", customers.get(4923).getAddress());
	}

	@Test
	@DisplayName("Record 4924: City is King of Prussia")
	void CityOfRecord4924() {
		assertEquals("King of Prussia", customers.get(4923).getCity());
	}

	@Test
	@DisplayName("Record 4924: County is Montgomery")
	void CountyOfRecord4924() {
		assertEquals("Montgomery", customers.get(4923).getCounty());
	}

	@Test
	@DisplayName("Record 4924: State is PA")
	void StateOfRecord4924() {
		assertEquals("PA", customers.get(4923).getState());
	}

	@Test
	@DisplayName("Record 4924: ZIP is 19406")
	void ZIPOfRecord4924() {
		assertEquals("19406", customers.get(4923).getZIP());
	}

	@Test
	@DisplayName("Record 4924: Phone is 610-337-3023")
	void PhoneOfRecord4924() {
		assertEquals("610-337-3023", customers.get(4923).getPhone());
	}

	@Test
	@DisplayName("Record 4924: Fax is 610-337-7785")
	void FaxOfRecord4924() {
		assertEquals("610-337-7785", customers.get(4923).getFax());
	}

	@Test
	@DisplayName("Record 4924: Email is leanne@tikkanen.com")
	void EmailOfRecord4924() {
		assertEquals("leanne@tikkanen.com", customers.get(4923).getEmail());
	}

	@Test
	@DisplayName("Record 4924: Web is http://www.leannetikkanen.com")
	void WebOfRecord4924() {
		assertEquals("http://www.leannetikkanen.com", customers.get(4923).getWeb());
	}
}
