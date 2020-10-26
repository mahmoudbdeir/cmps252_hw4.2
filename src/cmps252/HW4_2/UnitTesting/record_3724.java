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

@Tag("9")
class Record_3724 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3724: FirstName is Deanna")
	void FirstNameOfRecord3724() {
		assertEquals("Deanna", customers.get(3723).getFirstName());
	}

	@Test
	@DisplayName("Record 3724: LastName is Bellemy")
	void LastNameOfRecord3724() {
		assertEquals("Bellemy", customers.get(3723).getLastName());
	}

	@Test
	@DisplayName("Record 3724: Company is Franklin, Peter Esq")
	void CompanyOfRecord3724() {
		assertEquals("Franklin, Peter Esq", customers.get(3723).getCompany());
	}

	@Test
	@DisplayName("Record 3724: Address is 127 Brighton Ave")
	void AddressOfRecord3724() {
		assertEquals("127 Brighton Ave", customers.get(3723).getAddress());
	}

	@Test
	@DisplayName("Record 3724: City is East Orange")
	void CityOfRecord3724() {
		assertEquals("East Orange", customers.get(3723).getCity());
	}

	@Test
	@DisplayName("Record 3724: County is Essex")
	void CountyOfRecord3724() {
		assertEquals("Essex", customers.get(3723).getCounty());
	}

	@Test
	@DisplayName("Record 3724: State is NJ")
	void StateOfRecord3724() {
		assertEquals("NJ", customers.get(3723).getState());
	}

	@Test
	@DisplayName("Record 3724: ZIP is 7017")
	void ZIPOfRecord3724() {
		assertEquals("7017", customers.get(3723).getZIP());
	}

	@Test
	@DisplayName("Record 3724: Phone is 973-674-8207")
	void PhoneOfRecord3724() {
		assertEquals("973-674-8207", customers.get(3723).getPhone());
	}

	@Test
	@DisplayName("Record 3724: Fax is 973-674-5894")
	void FaxOfRecord3724() {
		assertEquals("973-674-5894", customers.get(3723).getFax());
	}

	@Test
	@DisplayName("Record 3724: Email is deanna@bellemy.com")
	void EmailOfRecord3724() {
		assertEquals("deanna@bellemy.com", customers.get(3723).getEmail());
	}

	@Test
	@DisplayName("Record 3724: Web is http://www.deannabellemy.com")
	void WebOfRecord3724() {
		assertEquals("http://www.deannabellemy.com", customers.get(3723).getWeb());
	}
}
