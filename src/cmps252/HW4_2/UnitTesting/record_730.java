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

@Tag("10")
class Record_730 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 730: FirstName is Lauretta")
	void FirstNameOfRecord730() {
		assertEquals("Lauretta", customers.get(729).getFirstName());
	}

	@Test
	@DisplayName("Record 730: LastName is Scammahorn")
	void LastNameOfRecord730() {
		assertEquals("Scammahorn", customers.get(729).getLastName());
	}

	@Test
	@DisplayName("Record 730: Company is Goldfyn, Jerome Esq")
	void CompanyOfRecord730() {
		assertEquals("Goldfyn, Jerome Esq", customers.get(729).getCompany());
	}

	@Test
	@DisplayName("Record 730: Address is 3844 Palmer Ct")
	void AddressOfRecord730() {
		assertEquals("3844 Palmer Ct", customers.get(729).getAddress());
	}

	@Test
	@DisplayName("Record 730: City is Cincinnati")
	void CityOfRecord730() {
		assertEquals("Cincinnati", customers.get(729).getCity());
	}

	@Test
	@DisplayName("Record 730: County is Clermont")
	void CountyOfRecord730() {
		assertEquals("Clermont", customers.get(729).getCounty());
	}

	@Test
	@DisplayName("Record 730: State is OH")
	void StateOfRecord730() {
		assertEquals("OH", customers.get(729).getState());
	}

	@Test
	@DisplayName("Record 730: ZIP is 45245")
	void ZIPOfRecord730() {
		assertEquals("45245", customers.get(729).getZIP());
	}

	@Test
	@DisplayName("Record 730: Phone is 513-943-5907")
	void PhoneOfRecord730() {
		assertEquals("513-943-5907", customers.get(729).getPhone());
	}

	@Test
	@DisplayName("Record 730: Fax is 513-943-1453")
	void FaxOfRecord730() {
		assertEquals("513-943-1453", customers.get(729).getFax());
	}

	@Test
	@DisplayName("Record 730: Email is lauretta@scammahorn.com")
	void EmailOfRecord730() {
		assertEquals("lauretta@scammahorn.com", customers.get(729).getEmail());
	}

	@Test
	@DisplayName("Record 730: Web is http://www.laurettascammahorn.com")
	void WebOfRecord730() {
		assertEquals("http://www.laurettascammahorn.com", customers.get(729).getWeb());
	}
}
