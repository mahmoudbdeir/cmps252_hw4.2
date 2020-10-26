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

@Tag("44")
class Record_1777 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1777: FirstName is Stephen")
	void FirstNameOfRecord1777() {
		assertEquals("Stephen", customers.get(1776).getFirstName());
	}

	@Test
	@DisplayName("Record 1777: LastName is Goslee")
	void LastNameOfRecord1777() {
		assertEquals("Goslee", customers.get(1776).getLastName());
	}

	@Test
	@DisplayName("Record 1777: Company is Robertson, John D Esq")
	void CompanyOfRecord1777() {
		assertEquals("Robertson, John D Esq", customers.get(1776).getCompany());
	}

	@Test
	@DisplayName("Record 1777: Address is 217 Mount Vernon Ave")
	void AddressOfRecord1777() {
		assertEquals("217 Mount Vernon Ave", customers.get(1776).getAddress());
	}

	@Test
	@DisplayName("Record 1777: City is Bakersfield")
	void CityOfRecord1777() {
		assertEquals("Bakersfield", customers.get(1776).getCity());
	}

	@Test
	@DisplayName("Record 1777: County is Kern")
	void CountyOfRecord1777() {
		assertEquals("Kern", customers.get(1776).getCounty());
	}

	@Test
	@DisplayName("Record 1777: State is CA")
	void StateOfRecord1777() {
		assertEquals("CA", customers.get(1776).getState());
	}

	@Test
	@DisplayName("Record 1777: ZIP is 93307")
	void ZIPOfRecord1777() {
		assertEquals("93307", customers.get(1776).getZIP());
	}

	@Test
	@DisplayName("Record 1777: Phone is 661-321-5850")
	void PhoneOfRecord1777() {
		assertEquals("661-321-5850", customers.get(1776).getPhone());
	}

	@Test
	@DisplayName("Record 1777: Fax is 661-321-8789")
	void FaxOfRecord1777() {
		assertEquals("661-321-8789", customers.get(1776).getFax());
	}

	@Test
	@DisplayName("Record 1777: Email is stephen@goslee.com")
	void EmailOfRecord1777() {
		assertEquals("stephen@goslee.com", customers.get(1776).getEmail());
	}

	@Test
	@DisplayName("Record 1777: Web is http://www.stephengoslee.com")
	void WebOfRecord1777() {
		assertEquals("http://www.stephengoslee.com", customers.get(1776).getWeb());
	}
}
