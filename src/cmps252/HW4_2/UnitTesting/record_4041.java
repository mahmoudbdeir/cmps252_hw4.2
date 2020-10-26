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
class Record_4041 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4041: FirstName is Beverly")
	void FirstNameOfRecord4041() {
		assertEquals("Beverly", customers.get(4040).getFirstName());
	}

	@Test
	@DisplayName("Record 4041: LastName is Velotta")
	void LastNameOfRecord4041() {
		assertEquals("Velotta", customers.get(4040).getLastName());
	}

	@Test
	@DisplayName("Record 4041: Company is Engineers Auto Enterprise")
	void CompanyOfRecord4041() {
		assertEquals("Engineers Auto Enterprise", customers.get(4040).getCompany());
	}

	@Test
	@DisplayName("Record 4041: Address is 101 Greenwood Ave  #-180")
	void AddressOfRecord4041() {
		assertEquals("101 Greenwood Ave  #-180", customers.get(4040).getAddress());
	}

	@Test
	@DisplayName("Record 4041: City is Jenkintown")
	void CityOfRecord4041() {
		assertEquals("Jenkintown", customers.get(4040).getCity());
	}

	@Test
	@DisplayName("Record 4041: County is Montgomery")
	void CountyOfRecord4041() {
		assertEquals("Montgomery", customers.get(4040).getCounty());
	}

	@Test
	@DisplayName("Record 4041: State is PA")
	void StateOfRecord4041() {
		assertEquals("PA", customers.get(4040).getState());
	}

	@Test
	@DisplayName("Record 4041: ZIP is 19046")
	void ZIPOfRecord4041() {
		assertEquals("19046", customers.get(4040).getZIP());
	}

	@Test
	@DisplayName("Record 4041: Phone is 215-885-4650")
	void PhoneOfRecord4041() {
		assertEquals("215-885-4650", customers.get(4040).getPhone());
	}

	@Test
	@DisplayName("Record 4041: Fax is 215-885-0026")
	void FaxOfRecord4041() {
		assertEquals("215-885-0026", customers.get(4040).getFax());
	}

	@Test
	@DisplayName("Record 4041: Email is beverly@velotta.com")
	void EmailOfRecord4041() {
		assertEquals("beverly@velotta.com", customers.get(4040).getEmail());
	}

	@Test
	@DisplayName("Record 4041: Web is http://www.beverlyvelotta.com")
	void WebOfRecord4041() {
		assertEquals("http://www.beverlyvelotta.com", customers.get(4040).getWeb());
	}
}
