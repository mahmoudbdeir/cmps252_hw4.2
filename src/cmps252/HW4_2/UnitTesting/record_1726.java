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

@Tag("6")
class Record_1726 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1726: FirstName is Normand")
	void FirstNameOfRecord1726() {
		assertEquals("Normand", customers.get(1725).getFirstName());
	}

	@Test
	@DisplayName("Record 1726: LastName is Nail")
	void LastNameOfRecord1726() {
		assertEquals("Nail", customers.get(1725).getLastName());
	}

	@Test
	@DisplayName("Record 1726: Company is Snow Business Services")
	void CompanyOfRecord1726() {
		assertEquals("Snow Business Services", customers.get(1725).getCompany());
	}

	@Test
	@DisplayName("Record 1726: Address is 55 Harristown Rd")
	void AddressOfRecord1726() {
		assertEquals("55 Harristown Rd", customers.get(1725).getAddress());
	}

	@Test
	@DisplayName("Record 1726: City is Glen Rock")
	void CityOfRecord1726() {
		assertEquals("Glen Rock", customers.get(1725).getCity());
	}

	@Test
	@DisplayName("Record 1726: County is Bergen")
	void CountyOfRecord1726() {
		assertEquals("Bergen", customers.get(1725).getCounty());
	}

	@Test
	@DisplayName("Record 1726: State is NJ")
	void StateOfRecord1726() {
		assertEquals("NJ", customers.get(1725).getState());
	}

	@Test
	@DisplayName("Record 1726: ZIP is 7452")
	void ZIPOfRecord1726() {
		assertEquals("7452", customers.get(1725).getZIP());
	}

	@Test
	@DisplayName("Record 1726: Phone is 201-652-8881")
	void PhoneOfRecord1726() {
		assertEquals("201-652-8881", customers.get(1725).getPhone());
	}

	@Test
	@DisplayName("Record 1726: Fax is 201-652-6471")
	void FaxOfRecord1726() {
		assertEquals("201-652-6471", customers.get(1725).getFax());
	}

	@Test
	@DisplayName("Record 1726: Email is normand@nail.com")
	void EmailOfRecord1726() {
		assertEquals("normand@nail.com", customers.get(1725).getEmail());
	}

	@Test
	@DisplayName("Record 1726: Web is http://www.normandnail.com")
	void WebOfRecord1726() {
		assertEquals("http://www.normandnail.com", customers.get(1725).getWeb());
	}
}
