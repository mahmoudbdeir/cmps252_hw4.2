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

@Tag("27")
class Record_3012 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3012: FirstName is Wiley")
	void FirstNameOfRecord3012() {
		assertEquals("Wiley", customers.get(3011).getFirstName());
	}

	@Test
	@DisplayName("Record 3012: LastName is Elzie")
	void LastNameOfRecord3012() {
		assertEquals("Elzie", customers.get(3011).getLastName());
	}

	@Test
	@DisplayName("Record 3012: Company is Computer Communications Inc")
	void CompanyOfRecord3012() {
		assertEquals("Computer Communications Inc", customers.get(3011).getCompany());
	}

	@Test
	@DisplayName("Record 3012: Address is 900 Interchange Blvd")
	void AddressOfRecord3012() {
		assertEquals("900 Interchange Blvd", customers.get(3011).getAddress());
	}

	@Test
	@DisplayName("Record 3012: City is Newark")
	void CityOfRecord3012() {
		assertEquals("Newark", customers.get(3011).getCity());
	}

	@Test
	@DisplayName("Record 3012: County is New Castle")
	void CountyOfRecord3012() {
		assertEquals("New Castle", customers.get(3011).getCounty());
	}

	@Test
	@DisplayName("Record 3012: State is DE")
	void StateOfRecord3012() {
		assertEquals("DE", customers.get(3011).getState());
	}

	@Test
	@DisplayName("Record 3012: ZIP is 19711")
	void ZIPOfRecord3012() {
		assertEquals("19711", customers.get(3011).getZIP());
	}

	@Test
	@DisplayName("Record 3012: Phone is 302-328-7231")
	void PhoneOfRecord3012() {
		assertEquals("302-328-7231", customers.get(3011).getPhone());
	}

	@Test
	@DisplayName("Record 3012: Fax is 302-328-5805")
	void FaxOfRecord3012() {
		assertEquals("302-328-5805", customers.get(3011).getFax());
	}

	@Test
	@DisplayName("Record 3012: Email is wiley@elzie.com")
	void EmailOfRecord3012() {
		assertEquals("wiley@elzie.com", customers.get(3011).getEmail());
	}

	@Test
	@DisplayName("Record 3012: Web is http://www.wileyelzie.com")
	void WebOfRecord3012() {
		assertEquals("http://www.wileyelzie.com", customers.get(3011).getWeb());
	}
}
