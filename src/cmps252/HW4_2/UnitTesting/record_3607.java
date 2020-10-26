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

@Tag("26")
class Record_3607 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3607: FirstName is Dewitt")
	void FirstNameOfRecord3607() {
		assertEquals("Dewitt", customers.get(3606).getFirstName());
	}

	@Test
	@DisplayName("Record 3607: LastName is Picchi")
	void LastNameOfRecord3607() {
		assertEquals("Picchi", customers.get(3606).getLastName());
	}

	@Test
	@DisplayName("Record 3607: Company is American Legal Aid Services")
	void CompanyOfRecord3607() {
		assertEquals("American Legal Aid Services", customers.get(3606).getCompany());
	}

	@Test
	@DisplayName("Record 3607: Address is 95 Main St")
	void AddressOfRecord3607() {
		assertEquals("95 Main St", customers.get(3606).getAddress());
	}

	@Test
	@DisplayName("Record 3607: City is Auburn")
	void CityOfRecord3607() {
		assertEquals("Auburn", customers.get(3606).getCity());
	}

	@Test
	@DisplayName("Record 3607: County is Androscoggin")
	void CountyOfRecord3607() {
		assertEquals("Androscoggin", customers.get(3606).getCounty());
	}

	@Test
	@DisplayName("Record 3607: State is ME")
	void StateOfRecord3607() {
		assertEquals("ME", customers.get(3606).getState());
	}

	@Test
	@DisplayName("Record 3607: ZIP is 4210")
	void ZIPOfRecord3607() {
		assertEquals("4210", customers.get(3606).getZIP());
	}

	@Test
	@DisplayName("Record 3607: Phone is 207-784-5247")
	void PhoneOfRecord3607() {
		assertEquals("207-784-5247", customers.get(3606).getPhone());
	}

	@Test
	@DisplayName("Record 3607: Fax is 207-784-4875")
	void FaxOfRecord3607() {
		assertEquals("207-784-4875", customers.get(3606).getFax());
	}

	@Test
	@DisplayName("Record 3607: Email is dewitt@picchi.com")
	void EmailOfRecord3607() {
		assertEquals("dewitt@picchi.com", customers.get(3606).getEmail());
	}

	@Test
	@DisplayName("Record 3607: Web is http://www.dewittpicchi.com")
	void WebOfRecord3607() {
		assertEquals("http://www.dewittpicchi.com", customers.get(3606).getWeb());
	}
}
