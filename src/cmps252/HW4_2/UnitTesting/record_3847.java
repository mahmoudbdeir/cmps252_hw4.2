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

@Tag("25")
class Record_3847 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3847: FirstName is Donald")
	void FirstNameOfRecord3847() {
		assertEquals("Donald", customers.get(3846).getFirstName());
	}

	@Test
	@DisplayName("Record 3847: LastName is Flamm")
	void LastNameOfRecord3847() {
		assertEquals("Flamm", customers.get(3846).getLastName());
	}

	@Test
	@DisplayName("Record 3847: Company is Beach Basket")
	void CompanyOfRecord3847() {
		assertEquals("Beach Basket", customers.get(3846).getCompany());
	}

	@Test
	@DisplayName("Record 3847: Address is 625 Marquette Ave  #-710")
	void AddressOfRecord3847() {
		assertEquals("625 Marquette Ave  #-710", customers.get(3846).getAddress());
	}

	@Test
	@DisplayName("Record 3847: City is Minneapolis")
	void CityOfRecord3847() {
		assertEquals("Minneapolis", customers.get(3846).getCity());
	}

	@Test
	@DisplayName("Record 3847: County is Hennepin")
	void CountyOfRecord3847() {
		assertEquals("Hennepin", customers.get(3846).getCounty());
	}

	@Test
	@DisplayName("Record 3847: State is MN")
	void StateOfRecord3847() {
		assertEquals("MN", customers.get(3846).getState());
	}

	@Test
	@DisplayName("Record 3847: ZIP is 55402")
	void ZIPOfRecord3847() {
		assertEquals("55402", customers.get(3846).getZIP());
	}

	@Test
	@DisplayName("Record 3847: Phone is 612-342-3728")
	void PhoneOfRecord3847() {
		assertEquals("612-342-3728", customers.get(3846).getPhone());
	}

	@Test
	@DisplayName("Record 3847: Fax is 612-342-2806")
	void FaxOfRecord3847() {
		assertEquals("612-342-2806", customers.get(3846).getFax());
	}

	@Test
	@DisplayName("Record 3847: Email is donald@flamm.com")
	void EmailOfRecord3847() {
		assertEquals("donald@flamm.com", customers.get(3846).getEmail());
	}

	@Test
	@DisplayName("Record 3847: Web is http://www.donaldflamm.com")
	void WebOfRecord3847() {
		assertEquals("http://www.donaldflamm.com", customers.get(3846).getWeb());
	}
}
