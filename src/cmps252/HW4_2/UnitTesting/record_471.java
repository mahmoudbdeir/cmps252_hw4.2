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

@Tag("40")
class Record_471 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 471: FirstName is Whitney")
	void FirstNameOfRecord471() {
		assertEquals("Whitney", customers.get(470).getFirstName());
	}

	@Test
	@DisplayName("Record 471: LastName is Bokman")
	void LastNameOfRecord471() {
		assertEquals("Bokman", customers.get(470).getLastName());
	}

	@Test
	@DisplayName("Record 471: Company is Gaffney, John F Esq")
	void CompanyOfRecord471() {
		assertEquals("Gaffney, John F Esq", customers.get(470).getCompany());
	}

	@Test
	@DisplayName("Record 471: Address is 7200 Interstate 20  #-101")
	void AddressOfRecord471() {
		assertEquals("7200 Interstate 20  #-101", customers.get(470).getAddress());
	}

	@Test
	@DisplayName("Record 471: City is Kennedale")
	void CityOfRecord471() {
		assertEquals("Kennedale", customers.get(470).getCity());
	}

	@Test
	@DisplayName("Record 471: County is Tarrant")
	void CountyOfRecord471() {
		assertEquals("Tarrant", customers.get(470).getCounty());
	}

	@Test
	@DisplayName("Record 471: State is TX")
	void StateOfRecord471() {
		assertEquals("TX", customers.get(470).getState());
	}

	@Test
	@DisplayName("Record 471: ZIP is 76060")
	void ZIPOfRecord471() {
		assertEquals("76060", customers.get(470).getZIP());
	}

	@Test
	@DisplayName("Record 471: Phone is 817-572-5680")
	void PhoneOfRecord471() {
		assertEquals("817-572-5680", customers.get(470).getPhone());
	}

	@Test
	@DisplayName("Record 471: Fax is 817-572-5978")
	void FaxOfRecord471() {
		assertEquals("817-572-5978", customers.get(470).getFax());
	}

	@Test
	@DisplayName("Record 471: Email is whitney@bokman.com")
	void EmailOfRecord471() {
		assertEquals("whitney@bokman.com", customers.get(470).getEmail());
	}

	@Test
	@DisplayName("Record 471: Web is http://www.whitneybokman.com")
	void WebOfRecord471() {
		assertEquals("http://www.whitneybokman.com", customers.get(470).getWeb());
	}
}
