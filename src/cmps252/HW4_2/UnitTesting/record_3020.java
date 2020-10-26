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
class Record_3020 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3020: FirstName is Willie")
	void FirstNameOfRecord3020() {
		assertEquals("Willie", customers.get(3019).getFirstName());
	}

	@Test
	@DisplayName("Record 3020: LastName is Courteau")
	void LastNameOfRecord3020() {
		assertEquals("Courteau", customers.get(3019).getLastName());
	}

	@Test
	@DisplayName("Record 3020: Company is Ins & Risk Mgmt Agy Oh Inc")
	void CompanyOfRecord3020() {
		assertEquals("Ins & Risk Mgmt Agy Oh Inc", customers.get(3019).getCompany());
	}

	@Test
	@DisplayName("Record 3020: Address is 605 N York St")
	void AddressOfRecord3020() {
		assertEquals("605 N York St", customers.get(3019).getAddress());
	}

	@Test
	@DisplayName("Record 3020: City is Elmhurst")
	void CityOfRecord3020() {
		assertEquals("Elmhurst", customers.get(3019).getCity());
	}

	@Test
	@DisplayName("Record 3020: County is DuPage")
	void CountyOfRecord3020() {
		assertEquals("DuPage", customers.get(3019).getCounty());
	}

	@Test
	@DisplayName("Record 3020: State is IL")
	void StateOfRecord3020() {
		assertEquals("IL", customers.get(3019).getState());
	}

	@Test
	@DisplayName("Record 3020: ZIP is 60126")
	void ZIPOfRecord3020() {
		assertEquals("60126", customers.get(3019).getZIP());
	}

	@Test
	@DisplayName("Record 3020: Phone is 630-941-0655")
	void PhoneOfRecord3020() {
		assertEquals("630-941-0655", customers.get(3019).getPhone());
	}

	@Test
	@DisplayName("Record 3020: Fax is 630-941-3389")
	void FaxOfRecord3020() {
		assertEquals("630-941-3389", customers.get(3019).getFax());
	}

	@Test
	@DisplayName("Record 3020: Email is willie@courteau.com")
	void EmailOfRecord3020() {
		assertEquals("willie@courteau.com", customers.get(3019).getEmail());
	}

	@Test
	@DisplayName("Record 3020: Web is http://www.williecourteau.com")
	void WebOfRecord3020() {
		assertEquals("http://www.williecourteau.com", customers.get(3019).getWeb());
	}
}
