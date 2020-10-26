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

@Tag("1")
class Record_2570 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2570: FirstName is Irving")
	void FirstNameOfRecord2570() {
		assertEquals("Irving", customers.get(2569).getFirstName());
	}

	@Test
	@DisplayName("Record 2570: LastName is Kortum")
	void LastNameOfRecord2570() {
		assertEquals("Kortum", customers.get(2569).getLastName());
	}

	@Test
	@DisplayName("Record 2570: Company is Libbey, Robert M Esq")
	void CompanyOfRecord2570() {
		assertEquals("Libbey, Robert M Esq", customers.get(2569).getCompany());
	}

	@Test
	@DisplayName("Record 2570: Address is 3895 W Vernal Pike")
	void AddressOfRecord2570() {
		assertEquals("3895 W Vernal Pike", customers.get(2569).getAddress());
	}

	@Test
	@DisplayName("Record 2570: City is Bloomington")
	void CityOfRecord2570() {
		assertEquals("Bloomington", customers.get(2569).getCity());
	}

	@Test
	@DisplayName("Record 2570: County is Monroe")
	void CountyOfRecord2570() {
		assertEquals("Monroe", customers.get(2569).getCounty());
	}

	@Test
	@DisplayName("Record 2570: State is IN")
	void StateOfRecord2570() {
		assertEquals("IN", customers.get(2569).getState());
	}

	@Test
	@DisplayName("Record 2570: ZIP is 47404")
	void ZIPOfRecord2570() {
		assertEquals("47404", customers.get(2569).getZIP());
	}

	@Test
	@DisplayName("Record 2570: Phone is 812-339-1924")
	void PhoneOfRecord2570() {
		assertEquals("812-339-1924", customers.get(2569).getPhone());
	}

	@Test
	@DisplayName("Record 2570: Fax is 812-339-1628")
	void FaxOfRecord2570() {
		assertEquals("812-339-1628", customers.get(2569).getFax());
	}

	@Test
	@DisplayName("Record 2570: Email is irving@kortum.com")
	void EmailOfRecord2570() {
		assertEquals("irving@kortum.com", customers.get(2569).getEmail());
	}

	@Test
	@DisplayName("Record 2570: Web is http://www.irvingkortum.com")
	void WebOfRecord2570() {
		assertEquals("http://www.irvingkortum.com", customers.get(2569).getWeb());
	}
}
