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

@Tag("32")
class Record_2787 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2787: FirstName is Cathrine")
	void FirstNameOfRecord2787() {
		assertEquals("Cathrine", customers.get(2786).getFirstName());
	}

	@Test
	@DisplayName("Record 2787: LastName is Longsworth")
	void LastNameOfRecord2787() {
		assertEquals("Longsworth", customers.get(2786).getLastName());
	}

	@Test
	@DisplayName("Record 2787: Company is Derda L J Woodworking Inc")
	void CompanyOfRecord2787() {
		assertEquals("Derda L J Woodworking Inc", customers.get(2786).getCompany());
	}

	@Test
	@DisplayName("Record 2787: Address is 3947 Boul  #-1")
	void AddressOfRecord2787() {
		assertEquals("3947 Boul  #-1", customers.get(2786).getAddress());
	}

	@Test
	@DisplayName("Record 2787: City is Jacksonville")
	void CityOfRecord2787() {
		assertEquals("Jacksonville", customers.get(2786).getCity());
	}

	@Test
	@DisplayName("Record 2787: County is Duval")
	void CountyOfRecord2787() {
		assertEquals("Duval", customers.get(2786).getCounty());
	}

	@Test
	@DisplayName("Record 2787: State is FL")
	void StateOfRecord2787() {
		assertEquals("FL", customers.get(2786).getState());
	}

	@Test
	@DisplayName("Record 2787: ZIP is 32207")
	void ZIPOfRecord2787() {
		assertEquals("32207", customers.get(2786).getZIP());
	}

	@Test
	@DisplayName("Record 2787: Phone is 904-399-2965")
	void PhoneOfRecord2787() {
		assertEquals("904-399-2965", customers.get(2786).getPhone());
	}

	@Test
	@DisplayName("Record 2787: Fax is 904-399-1543")
	void FaxOfRecord2787() {
		assertEquals("904-399-1543", customers.get(2786).getFax());
	}

	@Test
	@DisplayName("Record 2787: Email is cathrine@longsworth.com")
	void EmailOfRecord2787() {
		assertEquals("cathrine@longsworth.com", customers.get(2786).getEmail());
	}

	@Test
	@DisplayName("Record 2787: Web is http://www.cathrinelongsworth.com")
	void WebOfRecord2787() {
		assertEquals("http://www.cathrinelongsworth.com", customers.get(2786).getWeb());
	}
}
