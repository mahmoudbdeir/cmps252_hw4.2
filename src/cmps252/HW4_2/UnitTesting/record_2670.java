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

@Tag("46")
class Record_2670 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2670: FirstName is Tamika")
	void FirstNameOfRecord2670() {
		assertEquals("Tamika", customers.get(2669).getFirstName());
	}

	@Test
	@DisplayName("Record 2670: LastName is Kelm")
	void LastNameOfRecord2670() {
		assertEquals("Kelm", customers.get(2669).getLastName());
	}

	@Test
	@DisplayName("Record 2670: Company is Ar Ctr For Surg Hand & Upper")
	void CompanyOfRecord2670() {
		assertEquals("Ar Ctr For Surg Hand & Upper", customers.get(2669).getCompany());
	}

	@Test
	@DisplayName("Record 2670: Address is 245 W Chocolate Ave")
	void AddressOfRecord2670() {
		assertEquals("245 W Chocolate Ave", customers.get(2669).getAddress());
	}

	@Test
	@DisplayName("Record 2670: City is Hershey")
	void CityOfRecord2670() {
		assertEquals("Hershey", customers.get(2669).getCity());
	}

	@Test
	@DisplayName("Record 2670: County is Dauphin")
	void CountyOfRecord2670() {
		assertEquals("Dauphin", customers.get(2669).getCounty());
	}

	@Test
	@DisplayName("Record 2670: State is PA")
	void StateOfRecord2670() {
		assertEquals("PA", customers.get(2669).getState());
	}

	@Test
	@DisplayName("Record 2670: ZIP is 17033")
	void ZIPOfRecord2670() {
		assertEquals("17033", customers.get(2669).getZIP());
	}

	@Test
	@DisplayName("Record 2670: Phone is 717-533-9356")
	void PhoneOfRecord2670() {
		assertEquals("717-533-9356", customers.get(2669).getPhone());
	}

	@Test
	@DisplayName("Record 2670: Fax is 717-533-3565")
	void FaxOfRecord2670() {
		assertEquals("717-533-3565", customers.get(2669).getFax());
	}

	@Test
	@DisplayName("Record 2670: Email is tamika@kelm.com")
	void EmailOfRecord2670() {
		assertEquals("tamika@kelm.com", customers.get(2669).getEmail());
	}

	@Test
	@DisplayName("Record 2670: Web is http://www.tamikakelm.com")
	void WebOfRecord2670() {
		assertEquals("http://www.tamikakelm.com", customers.get(2669).getWeb());
	}
}
