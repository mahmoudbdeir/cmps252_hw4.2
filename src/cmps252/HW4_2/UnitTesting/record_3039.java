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

@Tag("28")
class Record_3039 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3039: FirstName is Amelia")
	void FirstNameOfRecord3039() {
		assertEquals("Amelia", customers.get(3038).getFirstName());
	}

	@Test
	@DisplayName("Record 3039: LastName is Harkavy")
	void LastNameOfRecord3039() {
		assertEquals("Harkavy", customers.get(3038).getLastName());
	}

	@Test
	@DisplayName("Record 3039: Company is Berry, Judith L Esq")
	void CompanyOfRecord3039() {
		assertEquals("Berry, Judith L Esq", customers.get(3038).getCompany());
	}

	@Test
	@DisplayName("Record 3039: Address is 1226 S Main St")
	void AddressOfRecord3039() {
		assertEquals("1226 S Main St", customers.get(3038).getAddress());
	}

	@Test
	@DisplayName("Record 3039: City is Fort Worth")
	void CityOfRecord3039() {
		assertEquals("Fort Worth", customers.get(3038).getCity());
	}

	@Test
	@DisplayName("Record 3039: County is Tarrant")
	void CountyOfRecord3039() {
		assertEquals("Tarrant", customers.get(3038).getCounty());
	}

	@Test
	@DisplayName("Record 3039: State is TX")
	void StateOfRecord3039() {
		assertEquals("TX", customers.get(3038).getState());
	}

	@Test
	@DisplayName("Record 3039: ZIP is 76104")
	void ZIPOfRecord3039() {
		assertEquals("76104", customers.get(3038).getZIP());
	}

	@Test
	@DisplayName("Record 3039: Phone is 817-332-8600")
	void PhoneOfRecord3039() {
		assertEquals("817-332-8600", customers.get(3038).getPhone());
	}

	@Test
	@DisplayName("Record 3039: Fax is 817-332-4698")
	void FaxOfRecord3039() {
		assertEquals("817-332-4698", customers.get(3038).getFax());
	}

	@Test
	@DisplayName("Record 3039: Email is amelia@harkavy.com")
	void EmailOfRecord3039() {
		assertEquals("amelia@harkavy.com", customers.get(3038).getEmail());
	}

	@Test
	@DisplayName("Record 3039: Web is http://www.ameliaharkavy.com")
	void WebOfRecord3039() {
		assertEquals("http://www.ameliaharkavy.com", customers.get(3038).getWeb());
	}
}
