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

@Tag("21")
class Record_3700 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3700: FirstName is Imelda")
	void FirstNameOfRecord3700() {
		assertEquals("Imelda", customers.get(3699).getFirstName());
	}

	@Test
	@DisplayName("Record 3700: LastName is Rummerfield")
	void LastNameOfRecord3700() {
		assertEquals("Rummerfield", customers.get(3699).getLastName());
	}

	@Test
	@DisplayName("Record 3700: Company is Storts, Lowell V Esq")
	void CompanyOfRecord3700() {
		assertEquals("Storts, Lowell V Esq", customers.get(3699).getCompany());
	}

	@Test
	@DisplayName("Record 3700: Address is 315 7th Ave N")
	void AddressOfRecord3700() {
		assertEquals("315 7th Ave N", customers.get(3699).getAddress());
	}

	@Test
	@DisplayName("Record 3700: City is Minneapolis")
	void CityOfRecord3700() {
		assertEquals("Minneapolis", customers.get(3699).getCity());
	}

	@Test
	@DisplayName("Record 3700: County is Hennepin")
	void CountyOfRecord3700() {
		assertEquals("Hennepin", customers.get(3699).getCounty());
	}

	@Test
	@DisplayName("Record 3700: State is MN")
	void StateOfRecord3700() {
		assertEquals("MN", customers.get(3699).getState());
	}

	@Test
	@DisplayName("Record 3700: ZIP is 55401")
	void ZIPOfRecord3700() {
		assertEquals("55401", customers.get(3699).getZIP());
	}

	@Test
	@DisplayName("Record 3700: Phone is 612-332-0775")
	void PhoneOfRecord3700() {
		assertEquals("612-332-0775", customers.get(3699).getPhone());
	}

	@Test
	@DisplayName("Record 3700: Fax is 612-332-3612")
	void FaxOfRecord3700() {
		assertEquals("612-332-3612", customers.get(3699).getFax());
	}

	@Test
	@DisplayName("Record 3700: Email is imelda@rummerfield.com")
	void EmailOfRecord3700() {
		assertEquals("imelda@rummerfield.com", customers.get(3699).getEmail());
	}

	@Test
	@DisplayName("Record 3700: Web is http://www.imeldarummerfield.com")
	void WebOfRecord3700() {
		assertEquals("http://www.imeldarummerfield.com", customers.get(3699).getWeb());
	}
}
