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
class Record_2782 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2782: FirstName is Autumn")
	void FirstNameOfRecord2782() {
		assertEquals("Autumn", customers.get(2781).getFirstName());
	}

	@Test
	@DisplayName("Record 2782: LastName is Vavra")
	void LastNameOfRecord2782() {
		assertEquals("Vavra", customers.get(2781).getLastName());
	}

	@Test
	@DisplayName("Record 2782: Company is U Haul Co")
	void CompanyOfRecord2782() {
		assertEquals("U Haul Co", customers.get(2781).getCompany());
	}

	@Test
	@DisplayName("Record 2782: Address is 33 W Bijou St  #-103")
	void AddressOfRecord2782() {
		assertEquals("33 W Bijou St  #-103", customers.get(2781).getAddress());
	}

	@Test
	@DisplayName("Record 2782: City is Colorado Springs")
	void CityOfRecord2782() {
		assertEquals("Colorado Springs", customers.get(2781).getCity());
	}

	@Test
	@DisplayName("Record 2782: County is El Paso")
	void CountyOfRecord2782() {
		assertEquals("El Paso", customers.get(2781).getCounty());
	}

	@Test
	@DisplayName("Record 2782: State is CO")
	void StateOfRecord2782() {
		assertEquals("CO", customers.get(2781).getState());
	}

	@Test
	@DisplayName("Record 2782: ZIP is 80903")
	void ZIPOfRecord2782() {
		assertEquals("80903", customers.get(2781).getZIP());
	}

	@Test
	@DisplayName("Record 2782: Phone is 719-633-9634")
	void PhoneOfRecord2782() {
		assertEquals("719-633-9634", customers.get(2781).getPhone());
	}

	@Test
	@DisplayName("Record 2782: Fax is 719-633-3399")
	void FaxOfRecord2782() {
		assertEquals("719-633-3399", customers.get(2781).getFax());
	}

	@Test
	@DisplayName("Record 2782: Email is autumn@vavra.com")
	void EmailOfRecord2782() {
		assertEquals("autumn@vavra.com", customers.get(2781).getEmail());
	}

	@Test
	@DisplayName("Record 2782: Web is http://www.autumnvavra.com")
	void WebOfRecord2782() {
		assertEquals("http://www.autumnvavra.com", customers.get(2781).getWeb());
	}
}
