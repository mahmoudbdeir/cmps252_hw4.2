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

@Tag("22")
class Record_2827 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2827: FirstName is Mac")
	void FirstNameOfRecord2827() {
		assertEquals("Mac", customers.get(2826).getFirstName());
	}

	@Test
	@DisplayName("Record 2827: LastName is Denoyer")
	void LastNameOfRecord2827() {
		assertEquals("Denoyer", customers.get(2826).getLastName());
	}

	@Test
	@DisplayName("Record 2827: Company is Brown Tank And Steel")
	void CompanyOfRecord2827() {
		assertEquals("Brown Tank And Steel", customers.get(2826).getCompany());
	}

	@Test
	@DisplayName("Record 2827: Address is 8888 Keystone Xing")
	void AddressOfRecord2827() {
		assertEquals("8888 Keystone Xing", customers.get(2826).getAddress());
	}

	@Test
	@DisplayName("Record 2827: City is Indianapolis")
	void CityOfRecord2827() {
		assertEquals("Indianapolis", customers.get(2826).getCity());
	}

	@Test
	@DisplayName("Record 2827: County is Marion")
	void CountyOfRecord2827() {
		assertEquals("Marion", customers.get(2826).getCounty());
	}

	@Test
	@DisplayName("Record 2827: State is IN")
	void StateOfRecord2827() {
		assertEquals("IN", customers.get(2826).getState());
	}

	@Test
	@DisplayName("Record 2827: ZIP is 46240")
	void ZIPOfRecord2827() {
		assertEquals("46240", customers.get(2826).getZIP());
	}

	@Test
	@DisplayName("Record 2827: Phone is 317-846-1899")
	void PhoneOfRecord2827() {
		assertEquals("317-846-1899", customers.get(2826).getPhone());
	}

	@Test
	@DisplayName("Record 2827: Fax is 317-846-8975")
	void FaxOfRecord2827() {
		assertEquals("317-846-8975", customers.get(2826).getFax());
	}

	@Test
	@DisplayName("Record 2827: Email is mac@denoyer.com")
	void EmailOfRecord2827() {
		assertEquals("mac@denoyer.com", customers.get(2826).getEmail());
	}

	@Test
	@DisplayName("Record 2827: Web is http://www.macdenoyer.com")
	void WebOfRecord2827() {
		assertEquals("http://www.macdenoyer.com", customers.get(2826).getWeb());
	}
}
