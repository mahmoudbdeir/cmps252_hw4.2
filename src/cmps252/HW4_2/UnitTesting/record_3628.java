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

@Tag("11")
class Record_3628 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3628: FirstName is Allyson")
	void FirstNameOfRecord3628() {
		assertEquals("Allyson", customers.get(3627).getFirstName());
	}

	@Test
	@DisplayName("Record 3628: LastName is Croswell")
	void LastNameOfRecord3628() {
		assertEquals("Croswell", customers.get(3627).getLastName());
	}

	@Test
	@DisplayName("Record 3628: Company is Sullivan, James L Esq")
	void CompanyOfRecord3628() {
		assertEquals("Sullivan, James L Esq", customers.get(3627).getCompany());
	}

	@Test
	@DisplayName("Record 3628: Address is 3744 E 82nd St")
	void AddressOfRecord3628() {
		assertEquals("3744 E 82nd St", customers.get(3627).getAddress());
	}

	@Test
	@DisplayName("Record 3628: City is Indianapolis")
	void CityOfRecord3628() {
		assertEquals("Indianapolis", customers.get(3627).getCity());
	}

	@Test
	@DisplayName("Record 3628: County is Marion")
	void CountyOfRecord3628() {
		assertEquals("Marion", customers.get(3627).getCounty());
	}

	@Test
	@DisplayName("Record 3628: State is IN")
	void StateOfRecord3628() {
		assertEquals("IN", customers.get(3627).getState());
	}

	@Test
	@DisplayName("Record 3628: ZIP is 46240")
	void ZIPOfRecord3628() {
		assertEquals("46240", customers.get(3627).getZIP());
	}

	@Test
	@DisplayName("Record 3628: Phone is 317-578-5779")
	void PhoneOfRecord3628() {
		assertEquals("317-578-5779", customers.get(3627).getPhone());
	}

	@Test
	@DisplayName("Record 3628: Fax is 317-578-0086")
	void FaxOfRecord3628() {
		assertEquals("317-578-0086", customers.get(3627).getFax());
	}

	@Test
	@DisplayName("Record 3628: Email is allyson@croswell.com")
	void EmailOfRecord3628() {
		assertEquals("allyson@croswell.com", customers.get(3627).getEmail());
	}

	@Test
	@DisplayName("Record 3628: Web is http://www.allysoncroswell.com")
	void WebOfRecord3628() {
		assertEquals("http://www.allysoncroswell.com", customers.get(3627).getWeb());
	}
}
